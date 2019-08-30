package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session1Servlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//getSession(true)→セッションの開始、セッションオブジェクトを生成
	HttpSession session = req.getSession(true);

	//setsetAttribute();nameにhasegawaを格納
	session.setAttribute("name", "hasegwa");


	resp.setContentType("text/html;charset=UTF-8");

	PrintWriter out = resp.getWriter();

	out.println("<html>");
	out.println("<head><title>Session Servlet1</title></head>");
	out.println("<body>");
	out.println("<h1>Session Servlet1</h1>");
	out.println("<h1>セッションを開始しました</h1>");
	out.println("</body>");
	out.println("</html>");

	out.close();
}
}
