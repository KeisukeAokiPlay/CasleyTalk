/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-03-28 13:32:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import main.java.Topic;
import java.util.List;

public final class read_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--CasleyTalk\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h2>CasleyTalk</h2>\r\n");
      out.write("\r\n");
      out.write("<a href=\"read\">再読み込み</a>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<form action=\"post\" method=\"Post\">\r\n");
      out.write("\tタイトル<input type=\"text\" name=\"title\" size=\"40\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<textarea name=\"content\" rows=\"5\" cols=\"40\"></textarea>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<input type=\"submit\" value=\"投稿\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");

List topics = (List)request.getAttribute("topics");
if(topics != null){
	for(int i = topics.size()-1; i >= 0; i--){
		Topic topic = (Topic)topics.get(i);

      out.write("\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\tタイトル ");
      out.print(topic.getTitle() );
      out.write("\r\n");
      out.write("\t\t(");
      out.print(topic.getPostDate());
      out.write(")\r\n");
      out.write("\t\t<pre>");
      out.print(topic.getContent() );
      out.write("</pre>\r\n");

	}
}

      out.write("\r\n");
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
