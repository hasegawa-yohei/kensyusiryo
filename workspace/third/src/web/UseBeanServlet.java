package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	EmpBean bean = new EmpBean();
	bean.setName("KnowledgeTaro");
	bean.setAge(20);

	req.setAttribute("emp", bean);
	RequestDispatcher rd = req.getRequestDispatcher("test.jsp");
	rd.forward(req, resp);
}
}
