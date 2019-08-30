package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SetAttributeServlet extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//セッションを開始し、sessionオブジェクトを生成
	 HttpSession session = req.getSession(true);
	//sessionオブジェクト
	 session.setAttribute("name","KnowledgeTaro");
	//requestオブジェクト
	 req.setAttribute("age", 20);
	 //dispatch.jspのページに飛ぶ（req,respを保持したまま）
	 RequestDispatcher rd = req.getRequestDispatcher("dispatch.jsp");
	 rd.forward(req, resp);
}
}
