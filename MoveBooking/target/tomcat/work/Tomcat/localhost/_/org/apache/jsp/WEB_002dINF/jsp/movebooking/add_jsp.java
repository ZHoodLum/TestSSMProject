/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-15 10:19:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.movebooking;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.2.1.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"text-align: center;\">\r\n");
      out.write("\t<h3>顺丰搬家预约登记</h3>\r\n");
      out.write("\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/moveingbook/insert.action\" method=\"post\">\r\n");
      out.write("\t\t<table border=\"1\" width=\"600\" style=\"margin: 0 auto;margin-top:50px;\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"150\">起始地区</td>\r\n");
      out.write("\t\t\t\t<td id=\"area\">\r\n");
      out.write("\t\t\t\t\t<select name=\"area\" style=\"width:150px;\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">海淀区</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">朝阳区</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\" selected=\"selected\">西城区</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">东城区</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">丰台区</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"5\">大兴区</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"6\">石景山</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>所用车型</td>\r\n");
      out.write("\t\t\t\t<td id=\"movedate\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"movedate\">金杯\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"movedate\">皮卡\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"movedate\" checked=\"checked\">厢式货车\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"movedate\">1041货车\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>搬家日期</td>\r\n");
      out.write("\t\t\t\t<td id=\"movedate\">\r\n");
      out.write("\t\t\t\t\t<input type=\"date\" name=\"movedate\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>联系人</td>\r\n");
      out.write("\t\t\t\t<td id=\"contact\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"contact\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>联系电话</td>\r\n");
      out.write("\t\t\t\t<td  id=\"phone\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phone\">\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" id=\"text1\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"预约登记\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}