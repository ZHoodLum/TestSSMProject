/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-15 07:07:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.2.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"[value='查询']\").click(function(){\r\n");
      out.write("\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/elecust/getbyid.action\";\r\n");
      out.write("\t\tvar data = $(\"[name='cardId']\").serialize();//?cardId=1002-003\r\n");
      out.write("\t\t$.post(url,data,function(callbackData){\r\n");
      out.write("\t\t\t$(\"#uname\").text(\"\");\r\n");
      out.write("\t\t\t$(\"#id\").text(\"\");\r\n");
      out.write("\t\t\t$(\"#addr\").text(\"\");\r\n");
      out.write("\t\t\t$(\"#ownMoney\").text(\"\");\r\n");
      out.write("\t\t\tif(callbackData == \"\"){\r\n");
      out.write("\t\t\t\talert(\"单号输入错误\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(\"#uname\").text(callbackData.uname);\r\n");
      out.write("\t\t\t$(\"#id\").text(callbackData.cardId);\r\n");
      out.write("\t\t\t$(\"#addr\").text(callbackData.addr);\r\n");
      out.write("\t\t\t$(\"#ownMoney\").text(callbackData.ownMoney);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(callbackData.ownMoney == 0){\r\n");
      out.write("\t\t\t\t//使用prop方法设置disabled、checked、selected\r\n");
      out.write("\t\t\t\t$(\"[value='缴费']\").prop(\"disabled\",true);\r\n");
      out.write("\t\t\t\t$(\"#text1\").text(\"感谢您对中国电力的支持！\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"[value='缴费']\").prop(\"disabled\",false);\r\n");
      out.write("\t\t\t\t$(\"#text1\").text(\"您的余额已不足，请及时充值！\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"[value='缴费']\").click(function(){\r\n");
      out.write("\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/elecust/charge.action\";\r\n");
      out.write("\t\t//表单用val()得到值，非表单使用text()得到值\r\n");
      out.write("\t\tvar data = \"eleCardId=\"+$(\"#id\").text()+\"&bankCardId=\"+$(\"[name='bankCardId']\").val();\r\n");
      out.write("\t\t$.post(url,data,function(callbackData){\r\n");
      out.write("\t\t\tif(callbackData == 0){\r\n");
      out.write("\t\t\t\talert(\"银行卡号不存在！\");\r\n");
      out.write("\t\t\t}else if(callbackData == 1){\r\n");
      out.write("\t\t\t\talert(\"银行卡余额不足！\");\r\n");
      out.write("\t\t\t}else if(callbackData == 2){\r\n");
      out.write("\t\t\t\tvar date = new Date();\r\n");
      out.write("\t\t\t\tvar year = date.getFullYear();\r\n");
      out.write("\t\t\t\tvar month = date.getMonth();\r\n");
      out.write("\t\t\t\tvar day = date.getDate();\r\n");
      out.write("\t\t\t\tvar msg = \"尊敬的 \"+$(\"#uname\").text()+\"您于 \"+year+\"-\"+(month+1)+\"-\"+day+\" 号\";\r\n");
      out.write("\t\t\t\tmsg += \"用电单号 \"+$(\"#id\").text()+\" 缴费 \"+$(\"#ownMoney\").text()+\"元 感谢对供电事业的支持！\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"<div>\").text(msg).appendTo(\"body\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#ownMoney\").text(\"0\");\r\n");
      out.write("\t\t\t\t$(\"[value='缴费']\").prop(\"disabled\",true);\r\n");
      out.write("\t\t\t}else if(callbackData == 3){\r\n");
      out.write("\t\t\t\talert(\"缴费失败！\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"text-align: center;\">\r\n");
      out.write("\t单号：<input type=\"text\" name=\"cardId\"><input type=\"button\" value=\"查询\">\r\n");
      out.write("\t<table border=\"1\" width=\"600\" style=\"margin: 0 auto;margin-top:50px;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"150\">用户姓名</td>\r\n");
      out.write("\t\t\t<td id=\"uname\">&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>单号</td>\r\n");
      out.write("\t\t\t<td id=\"id\">&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>地址</td>\r\n");
      out.write("\t\t\t<td id=\"addr\">&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>目前欠费</td>\r\n");
      out.write("\t\t\t<td id=\"ownMoney\">&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>银行卡号</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"bankCardId\">\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" id=\"text1\">&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<input type=\"button\" value=\"缴费\">\r\n");
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