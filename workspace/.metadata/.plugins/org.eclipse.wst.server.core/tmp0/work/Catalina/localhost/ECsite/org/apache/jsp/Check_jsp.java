/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-07-31 01:08:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import web.DetailsServlet;
import java.util.ArrayList;

public final class Check_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("web.DetailsServlet");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 int price = 0; 
      out.write('\r');
      out.write('\n');
 double sum = 0; 
      out.write('\r');
      out.write('\n');
 double Taxprice = 0; 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"NewFile.css\">\r\n");
      out.write("<title>購入確認</title>\r\n");
      out.write("</head>\r\n");
      out.write("<div class=\"header\"></div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<h1>購入してもよろしいでしょうか？？</h1><br>\r\n");
      out.write("</div>\r\n");
      out.write("<div align=\"center\">\r\n");
 ArrayList namelist = new ArrayList(); 
      out.write('\r');
      out.write('\n');
 ArrayList pricelist = new ArrayList(); 
      out.write("\r\n");
      out.write("\r\n");
 namelist =  (ArrayList) session.getAttribute("namelist"); 
      out.write('\r');
      out.write('\n');
 pricelist = (ArrayList) session.getAttribute("pricelist"); 
      out.write('\r');
      out.write('\n');
 ArrayList numlist = (ArrayList)  session.getAttribute("numlist"); 
      out.write("\r\n");
      out.write("<table border=\"1\" width=\"400\" \"height=\"350\" cellspacing=\"0\" cellpadding=\"5\" bordercolor=\"black\">\r\n");
      out.write("<tr>\r\n");
      out.write("<th align=\"center\"bgcolor=\"#CCCCCC\">商品名</th>\r\n");
      out.write("<th align=\"center\"bgcolor=\"#CCCCCC\">単価</th>\r\n");
      out.write("<th align=\"center\"bgcolor=\"#CCCCCC\">数量</th>\r\n");
      out.write("</tr>\r\n");
 for(int i=0;i<namelist.size();i++){  
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\">");
      out.print( namelist.get(i) );
      out.write("</td>\r\n");
      out.write("<td align=\"right\">&yen;");
      out.print( pricelist.get(i) );
      out.write("</td>\r\n");
      out.write("<td align=\"right\">");
      out.print( numlist.get(i) );
      out.write("</td>\r\n");
 } 
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th colspan=\"2\"bgcolor=\"#CCCCCC\">消費税</th>\r\n");
      out.write("<td align=\"right\">&yen;");
      out.print( session.getAttribute("Taxprice") );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th colspan=\"2\"bgcolor=\"#CCCCCC\">合計金額</th>\r\n");
      out.write("\r\n");
      out.write("<td align=\"right\">&yen;");
      out.print( session.getAttribute("sumPrice") );
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<table><tr>\r\n");
      out.write("<td>\r\n");
      out.write("<form action = \"search\" method=\"post\">\r\n");
      out.write("<button class=\"button2\" name=\"act\" type=\"submit\" value=\"いいえ\">いいえ</button>\r\n");
      out.write("</form>\r\n");
      out.write("</td>\r\n");
      out.write("<td>\r\n");
      out.write("<form action = \"Buy\" method=\"post\">\r\n");
      out.write("<button class=\"button2\" type=\"submit\" value=\"はい\">はい</button>\r\n");
      out.write("</form>\r\n");
      out.write("</td>\r\n");
      out.write("</tr></table>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}