/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.35
 * Generated at: 2020-06-30 14:23:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board.CrossFit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.FileVo;
import java.util.List;
import vo.BoardVo;
import dao.BoardCfDao;

public final class ContentCf_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("vo.FileVo");
    _jspx_imports_classes.add("vo.BoardVo");
    _jspx_imports_classes.add("dao.BoardCfDao");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Retrospect by TEMPLATED</title>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("<!--[if lte IE 8]><script src=\"assets/js/ie/html5shiv.js\"></script><![endif]-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../assets/css/main.css\" />\r\n");
      out.write("<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"assets/css/ie8.css\" /><![endif]-->\r\n");
      out.write("<!--[if lte IE 9]><link rel=\"stylesheet\" href=\"assets/css/ie9.css\" /><![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

	String id = (String)session.getAttribute("id");	
	
	int num = Integer.parseInt(request.getParameter("num"));
	String pageNum = request.getParameter("pageNum");
	
	BoardCfDao dao = BoardCfDao.getInstance();
	dao.updateReadCnt(num);
	
	BoardVo vo = dao.getAllInfosByNum(num);
	List<FileVo> fileList = vo.getFileList();
	
	String cntnt = "";
	if(vo.getContent() !=null){
		cntnt = vo.getContent().replace("\r\n", "<br>");
		
	}

      out.write("\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../board/nav.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<article>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<h1>Cross Fit</h1>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<table id=\"notice\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th scope=\"col\" width=\"200\">No.</th>\r\n");
      out.write("\t\t\t<td width=\"500\" style=\"text-align: left;\">");
      out.print(vo.getNum() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th scope=\"col\">Read</th>\r\n");
      out.write("\t\t\t<td style=\"text-align: left;\">");
      out.print(vo.getReadcount() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th scope=\"col\">Writer</th>\r\n");
      out.write("\t\t\t<td style=\"text-align: left;\">");
      out.print(vo.getName() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th scope=\"col\">Date</th>\r\n");
      out.write("\t\t\t<td style=\"text-align: left;\">");
      out.print(vo.getRegDate() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th scope=\"col\">Title</th>\r\n");
      out.write("\t\t\t<td style=\"text-align: left;\">");
      out.print(vo.getTitle() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th scope=\"col\">Files</th>\r\n");
      out.write("\t\t\t<td style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t");

				if (fileList != null) {
					for (FileVo fileVo : fileList) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"download.jsp?uuid=");
      out.print(fileVo.getUuid() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(fileVo.getFilename() );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t");

					}
				}
				
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th scope=\"col\">글내용</th>\r\n");
      out.write("\t\t\t<td style=\"text-align: left;\">");
      out.print(cntnt );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"table_search\">\r\n");
      out.write("\t\t");

		// 로그인 아이디와 글작성자 아이디(이름)가 같으면 
		if (id.equals(vo.getName())) {
			
      out.write("\r\n");
      out.write("\t\t\t<button type=\"button\" onclick=\"location.href='ModifyForm.jsp?num=");
      out.print(vo.getNum() );
      out.write("&pageNum=");
      out.print(pageNum );
      out.write("'\">Modify</button>\r\n");
      out.write("\t\t\t<button type=\"button\" onclick=\"remove()\">Remove</button>\r\n");
      out.write("\t\t\t");

		}
		
      out.write("\r\n");
      out.write("\t\t<button type=\"button\" onclick=\"location.href='ReplyForm.jsp?reRef=");
      out.print(vo.getReRef() );
      out.write("&reLev=");
      out.print(vo.getReLev() );
      out.write("&reSeq=");
      out.print(vo.getReSeq() );
      out.write("&pageNum=");
      out.print(pageNum );
      out.write("'\">Reply</button>\r\n");
      out.write("\t\t<button type=\"button\" onclick=\"location.href='BoardMain.jsp?pageNum=");
      out.print(pageNum );
      out.write("'\">Return to List</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"clear\"></div>\r\n");
      out.write("\t<div id=\"page_control\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</article>\r\n");
      out.write("\r\n");
      out.write("\t<!-- footer -->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Scripts -->\r\n");
      out.write("   <script src=\"../../assets/jquery-3.5.1.js\"></script>\r\n");
      out.write("   <script src=\"../../assets/js/jquery.min.js\"></script>\r\n");
      out.write("   <script src=\"../../assets/js/skel.min.js\"></script>\r\n");
      out.write("   <script src=\"../../assets/js/util.js\"></script>\r\n");
      out.write("   <script src=\"../../assets/js/main.js\"></script>\r\n");
      out.write("   <script>\r\n");
      out.write("   function remove() {\r\n");
      out.write("\t\tvar result = confirm('");
      out.print(vo.getNum() );
      out.write("번 글을 정말 삭제하시겠습니까?');\r\n");
      out.write("\t\tif (result) {\r\n");
      out.write("\t\t\tlocation.href = 'Delete.jsp?num=");
      out.print(vo.getNum() );
      out.write("&pageNum=");
      out.print(pageNum );
      out.write("';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("   </script>\r\n");
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
