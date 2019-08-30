package lesson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Testservlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//送られてきたパラメータの文字コードを設定している(無いと文字化け)
    	req.setCharacterEncoding("UTF-8");
    	//HTMLからparamという名前のパラメーターを取得してきて変数に格納
    	String name =req.getParameter("name");
    	String nendai =req.getParameter("nendai");
    	String sex =req.getParameter("sex");
    	//チェックボックスの複数の値をもってくることができる(getParameterValues)
    	String[] gengo =req.getParameterValues("gengo");
    	String biko =req.getParameter("biko");

        //HTML,UTF-8で書くという宣言
    	resp.setContentType("text/html; charset = UTF-8");
    	PrintWriter out = resp.getWriter();

    	out.println("<html>");
		out.println("<head><title>サンプルページ</title></head>");
		out.println("<body>");
		//変数xの値をHTMLで表示
		out.println("<h1><font size='3'>"+name+"</font></h1>");
		out.println("<h1><font size='3'>"+nendai+"</font></h1>");
		out.println("<h1><font size='3'>"+sex+"</font></h1>");
		 for (int i = 0; i <gengo.length; i++ ) {
	            out.println("<font size='3'>"+gengo[i] + "</font><br>");
	        }
		out.println("<h1><font size='3'>"+biko+"</font></h1>");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}
}
