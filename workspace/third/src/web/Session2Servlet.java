package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session2Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//getSession(false)にすることで、継続確認を行う
		//開始している→セッションオブジェクトが返ってくる
		//していない→nullが返ってくる
		HttpSession session = req.getSession(false);

		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		//session == null（セッションが開始していない）だったらする処理
		if (session == null) {
			out.println("<html>");
			out.println("<head><title>Session Servlet2</title></head>");
			out.println("<body>");
			out.println("<h1>Session Servlet2</h1>");
			out.println("<h1>セッションが開始されていません</h1>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
		else {
			out.println("<html>");
			out.println("<head><title>Session Servlet1</title></head>");
			out.println("<body>");
			out.println("<h1>Session Servlet2</h1>");
			out.println("<h1>セッションを継続しています</h1>");
			out.println("<h1>"+session.getAttribute("name")+"</h1>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}


	}
}
