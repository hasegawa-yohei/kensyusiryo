package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session3Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		//HTMLを記述する宣言
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

        if(session!=null) {
        	//sessionオブジェクトの消滅させる
        	session.invalidate();
        	out.println("<html>");
			out.println("<head><title>Session Servlet3</title></head>");
			out.println("<body>");
			out.println("<h1>Session Servlet3</h1>");
			out.println("<h1>セッションを終了しました</h1>");
			out.println("</body>");
			out.println("</html>");
			out.close();
        }
	}
}
