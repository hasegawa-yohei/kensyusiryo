package lesson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//setContentType()メソッド 出力するHTML文書の「MINEタイプ」と「コーディング」を指定する
		resp.setContentType("text/html; charset = UTF-8");
		//HTML文書を出力するための出力ストリームを取得（ブラウザにHTMLを出力するための準備）
		PrintWriter out = resp.getWriter();

		//ストリームに文字列を出力するためのメソッド（HTMLを書くために必要なメソッド）
		out.println("<html>");
		out.println("<head><title>サンプルページ</title></head>");
		out.println("<body>");
		out.println("<h1>HelloWorld!</h1>");
		out.println("</body>");
		out.println("</html>");
		//ここでおしまいですという宣言
		out.close();
	}

}
