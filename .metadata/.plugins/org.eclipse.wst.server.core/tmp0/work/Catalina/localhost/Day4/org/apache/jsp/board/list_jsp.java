/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-01-19 09:09:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.koreait.db.Dbconn;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.koreait.db.Dbconn");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
        return;
      }
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

	if(session.getAttribute("userid") == null){

      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		alert('????????? ??? ???????????????');\r\n");
      out.write("		location.href = '../login.jsp';\r\n");
      out.write("	</script>\r\n");
 
	}else{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSet rs_reply = null;
		int totalCount = 0;
		String sql= "";
		
		   try{
		      conn = Dbconn.getConnection();
		      if(conn != null){
		      sql = "select count(b_idx) as total from tb_board";
		      pstmt = conn.prepareStatement(sql);
		      rs = pstmt.executeQuery();
		      if(rs.next()){
		    	  totalCount = rs.getInt("total");
		      }
		      
		      sql= "select b_idx, b_userid, b_title, b_regdate, b_hit, b_like, b_content from tb_board order by b_idx desc";
		      pstmt = conn.prepareStatement(sql);
		      rs = pstmt.executeQuery();
	      }
	   }catch(Exception e){
	      e.printStackTrace();
	   }
	
      out.write("			\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>???????????? - ?????????</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h2>???????????? - ?????????</h2>\r\n");
      out.write("	<p>????????? : ");
      out.print(totalCount );
      out.write("???</p>\r\n");
      out.write("	<table border=\"1\" width=\"800\" style=\"text-align:center\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th width=\"50\">??????</th>\r\n");
      out.write("			<th width=\"300\">??????</th>\r\n");
      out.write("			<th width=\"100\">?????????</th>\r\n");
      out.write("			<th width=\"75\">?????????</th>\r\n");
      out.write("			<th width=\"200\">??????</th>\r\n");
      out.write("			<th width=\"75\">?????????!</th>\r\n");
      out.write("		</tr>\r\n");

	while(rs.next()){
			String b_idx = rs.getString("b_idx");
			String b_userid = rs.getString("b_userid");
			String b_title = rs.getString("b_title");
			String b_content = rs.getString("b_content");
			String b_regdate = rs.getString("b_regdate").substring(0,10);
			String b_hit = rs.getString("b_hit");
			String b_like = rs.getString("b_like");

      out.write("\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>");
      out.print(b_idx );
      out.write("</td>\r\n");
      out.write("			<td><a href=\"./view.jsp?b_idx=");
      out.print(b_idx);
      out.write('"');
      out.write('>');
      out.print(b_title);
      out.write("</a>\r\n");

			sql = "select r_idx, r_boardidx from tb_reply";
			pstmt = conn.prepareStatement(sql);
			rs_reply = pstmt.executeQuery();
			int re_count = 0;
			
			while(rs_reply.next()){
				int r_idx = rs_reply.getInt("r_idx");
				String r_boardidx = rs_reply.getString("r_boardidx");
				if(r_boardidx.equals(b_idx)){
					re_count ++;
				}
			}

      out.write("\r\n");
      out.write("			<span>(");
      out.print(re_count );
      out.write(")</span>\r\n");
      out.write("			</td>\r\n");
      out.write("			<td>");
      out.print(b_userid );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(b_hit );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(b_regdate );
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(b_like );
      out.write("</td>\r\n");
      out.write("		</tr>\r\n");

	}

      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("	<p><input type=\"button\" value=\"?????????\" onclick=\"location.href='write.jsp'\">\r\n");
      out.write("	<input type=\"button\" value=\"??????\" onclick=\"location.href='../login.jsp'\"></p>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

}

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
