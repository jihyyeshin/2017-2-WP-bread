/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-12-10 03:51:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=euc-kr");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<!-- calendar -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("   href=\"//code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css\"\r\n");
      out.write("   type=\"text/css\">\r\n");
      out.write("<script\r\n");
      out.write("   src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.8.18/jquery-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   $(function() {\r\n");
      out.write("      $(\"#date1\").datepicker();\r\n");
      out.write("   });\r\n");
      out.write("</script>\r\n");
      out.write("<title>Mr.Bread</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("   <div id=\"container\">\r\n");
      out.write("      <div>\r\n");
      out.write("         <ul class=\"h\">\r\n");
      out.write("            <li class=\"h\"><a class=\"h\" href=\"home.jsp\">HOME</a></li>\r\n");
      out.write("            <li class=\"h\"><a class=\"h\" href=\"content.jsp\">CONTENT</a></li>\r\n");
      out.write("            <li class=\"h\"><a class=\"h\" href=\"order.jsp\">ORDER</a></li>\r\n");
      out.write("            <li class=\"h\"><a class=\"h\" href=\"about.jsp\">ABOUT</a></li>\r\n");
      out.write("         </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <br /> <br /> <br />\r\n");
      out.write("      <div id=\"main\">\r\n");
      out.write("         <div id=\"part1\">\r\n");
      out.write("            <center>\r\n");
      out.write("               <form method=\"post\" action=\"cart-db.jsp\">\r\n");
      out.write("                  <p class=\"three\">your name &nbsp;&nbsp;&nbsp; password\r\n");
      out.write("                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; bread\r\n");
      out.write("                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                     date\r\n");
      out.write("                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                     number &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>\r\n");
      out.write("                  <input type=\"text\" name=\"yourname\" size=\"12\" /> <input\r\n");
      out.write("                     type=\"password\" name=\"password\" size=\"12\" /> <select\r\n");
      out.write("                     name=\"bread\">\r\n");
      out.write("                     <option value=\"Magic Mocha Cream Bread\">Magic Mocha</option>\r\n");
      out.write("                     <option value=\"Rice Topping Cheese Bread\">Rice Cheese</option>\r\n");
      out.write("                     <option value=\"Pumpkin Bread\">Pumpkin Bread</option>\r\n");
      out.write("                     <option value=\"Chocolate Twist\">Choco Twist</option>\r\n");
      out.write("                     <option value=\"Chocolate Scone\">Choco Scone</option>\r\n");
      out.write("                     <option value=\"Twisted Bread Stick\">Twisted Bread</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                  <!--<input type=\"text\" name=\"bread\" size=\"12\"/>-->\r\n");
      out.write("                  <input type=\"text\" name=\"date\" id=\"date1\" size=\"12\" /> <input\r\n");
      out.write("                     type=\"text\" name=\"number\" size=\"12\" /> <input type=\"submit\"\r\n");
      out.write("                     value=\"cart\">\r\n");
      out.write("                  ");

                     String flag = request.getParameter("flag");
                     if ("r".equals(flag)) {
                  
      out.write("\r\n");
      out.write("                  <input type=\"hidden\" name=\"ref\"\r\n");
      out.write("                     value=\"");
      out.print(request.getParameter("ref"));
      out.write("\"> <input\r\n");
      out.write("                     type=\"hidden\" name=\"reply\" value=\"y\">\r\n");
      out.write("                  ");

                     } else
                  
      out.write("\r\n");
      out.write("                  <input type=\"hidden\" name=\"reply\" value=\"n\">\r\n");
      out.write("               </form>\r\n");
      out.write("            </center>\r\n");
      out.write("\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"column\">\r\n");
      out.write("            <center>\r\n");
      out.write("               <br> <br>\r\n");
      out.write("               <div class=\"div1\">\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <p class=\"p4\">\r\n");
      out.write("                     <b>Order your fresh bread!<b />\r\n");
      out.write("                  </p>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <form method=\"post\" action=\"login_form.jsp\">\r\n");
      out.write("                     <input type=\"submit\" value=\"Admin Login\" class=\"button button2\">\r\n");
      out.write("                  </form>\r\n");
      out.write("                  <form method=\"post\" action=\"notice.jsp\">\r\n");
      out.write("                     <br>\r\n");
      out.write("                     <p class=\"p4\">\r\n");
      out.write("                        <b>check NOTICE<b />\r\n");
      out.write("                     </p>\r\n");
      out.write("                     <br> <input type=\"submit\" value=\"NOTICE\"\r\n");
      out.write("                        class=\"button button2\"> <br>\r\n");
      out.write("                  </form>\r\n");
      out.write("                  <br>\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("               <p class=\"p6\">\r\n");
      out.write("                  <br> <br> <br> <br> <br> <br>\r\n");
      out.write("                  <br>How to use Mr. Bread<br> <br> 1. Choose the\r\n");
      out.write("                  name of the bread, <br> the date of reservation, <br>\r\n");
      out.write("                  and the number of the bread you want.<br> <br> 2. Choose\r\n");
      out.write("                  the name of the bread, <br> the date of reservation, <br>\r\n");
      out.write("                  and the number of the bread you want.<br> <br> 3. Press\r\n");
      out.write("                  the ' Cast ' button <br> to enter the information in the\r\n");
      out.write("                  shopping cart.<br> <br> 4. You can check the shopping <br>\r\n");
      out.write("                  cart information on the ' Order ' page.<br> <br> 5.\r\n");
      out.write("                  Visit the date of your reservation <br> and take the bread\r\n");
      out.write("                  you ordered. <br> <br>\r\n");
      out.write("               </p>\r\n");
      out.write("            </center>\r\n");
      out.write("            <br />\r\n");
      out.write("         </div>\r\n");
      out.write("         <div id=\"part2\">\r\n");
      out.write("            <div>\r\n");
      out.write("               <marquee width=\"auto\" direction=\"right\" behavior=\"scroll\"\r\n");
      out.write("                  scrollamount=\"7\" scrolldelay=\"10\" loop=\"10\" hspace=\"5\" vspace=\"5\">\r\n");
      out.write("                  <img src=\"1.jpg\"> <img src=\"4.jpg\"> <img src=\"2.jpg\">\r\n");
      out.write("                  <img src=\"3.jpg\"> <img src=\"5.jpg\">\r\n");
      out.write("               </marquee>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
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