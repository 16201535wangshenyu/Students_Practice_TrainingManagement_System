/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.8.v20171121
 * Generated at: 2019-05-12 06:52:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javaBean.Student;

public final class manageStudent_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/D:/maven/repository/taglibs/standard/1.1.2/standard-1.1.2.jar", Long.valueOf(1546409114458L));
    _jspx_dependants.put("jar:file:/D:/maven/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javaBean.Student");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fstep_005fend_005fbegin;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fstep_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fstep_005fend_005fbegin.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>main</title>\r\n");
      out.write("    <link href=\"../../css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <script language=\"JavaScript\" src=\"../../JS/jquery.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        //顶部导航切换\r\n");
      out.write("        $(\".nav li a\").click(function () {\r\n");
      out.write("            $(\".nav li a.selected\").removeClass(\"selected\");\r\n");
      out.write("            $(this).addClass(\"selected\");\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        //导航切换\r\n");
      out.write("        $(\".menuson li\").click(function () {\r\n");
      out.write("            $(\".menuson li.active\").removeClass(\"active\");\r\n");
      out.write("            $(this).addClass(\"active\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('.title').click(function () {\r\n");
      out.write("            var $ul = $(this).next('ul');\r\n");
      out.write("            $('dd').find('ul').slideUp();\r\n");
      out.write("            if ($ul.is(':visible')) {\r\n");
      out.write("                $(this).next('ul').slideUp();\r\n");
      out.write("            } else {\r\n");
      out.write("                $(this).next('ul').slideDown();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("<body style=\"background:url('../../images/topbg.gif') repeat-x;\">\r\n");
      out.write("<div class=\"top\">\r\n");
      out.write("    <div class=\"topleft\">\r\n");
      out.write("        <a href=\"/admin/admin_index.jsp\"><img src=\"../../images/home.png\" style=\"width: 64px;height: 64px\" title=\"系统首页\"/></a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"nav\">\r\n");
      out.write("        <li><a href=\"/teacher_mana_indexServlet\"><img src=\"../../images/icon02.png\" title=\"教师管理\"/>\r\n");
      out.write("            <h2>教师管理</h2></a></li>\r\n");
      out.write("        <li><a href=\"/student_manage\" class=\"selected\"><img src=\"../../images/icon03.png\" title=\"学生管理\"/>\r\n");
      out.write("            <h2>学生管理</h2></a></li>\r\n");
      out.write("        <li><a href=\"/class_management_indexServlet\"><img src=\"../../images/icon01.png\" title=\"班级管理\"/>\r\n");
      out.write("            <h2>班级管理</h2></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"topright\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><span><img src=\"../../images/help.png\" title=\"帮助\" class=\"helpimg\"/></span><a href=\"#\">帮助</a></li>\r\n");
      out.write("            <li><a href=\"#\">关于</a></li>\r\n");
      out.write("            <li><a href=\"/logout\">退出</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"user\">\r\n");
      out.write("            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin_no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"lefttop\"><span></span>列表</div>\r\n");
      out.write("\r\n");
      out.write("    <dl class=\"leftmenu\">\r\n");
      out.write("        <dd>\r\n");
      out.write("            <div class=\"title\">\r\n");
      out.write("                <span><img src=\"../../images/leftico01.png\"/></span>管理信息\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"menuson\">\r\n");
      out.write("                <li><cite></cite><a href=\"/admin/student/addStudentInfo.jsp\">增加学生</a><i></i></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <div style=\"padding-left: 450px;width: 70%;height:40px;line-height:40px;overflow: hidden;margin: 0 auto;\">\r\n");
      out.write("            <div style=\"\">\r\n");
      out.write("                <div style=\"color: #000;text-align: center;font-size:30px;\">\r\n");
      out.write("                    <div style=\"width: 10.5%;float: left;\">学号</div>\r\n");
      out.write("                    <div style=\"width: 10.5%;float: left;\">名字</div>\r\n");
      out.write("                    <div style=\"width: 15.5%;float: left;\">联系电话</div>\r\n");
      out.write("                    <div style=\"float: left;width: 5.5%;\">|</div>\r\n");
      out.write("                    <div style=\"width: 10.5%;float: left;\">操作</div>\r\n");
      out.write("                </div><br>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 动态生成页面跳转标签 -->\r\n");
      out.write("        <div style=\"padding-left:187px;width: 76%;overflow: hidden;margin: 0 auto;border: 1px solid #000;position: absolute;top: 88.5%;background-color: #3cc3f6;color: #fff;\">\r\n");
      out.write("            <div style=\"height:30px;line-height:30px;\">\r\n");
      out.write("                <div style=\"padding-left: 20.5%;height:30px;line-height:30px;width: 80px;float: left;\">");
      out.print("第 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${current_page}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.print(" 页");
      out.write("</div>\r\n");
      out.write("                <div style=\"height:30px;line-height:30px;width: 80px;float: left;\">");
      out.print("共 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page_num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.print(" 页");
      out.write("</div>\r\n");
      out.write("                <div style=\"float: left\">\r\n");
      out.write("                    <a style=\"padding-left: 40px;\" href=\"/student_manage?current_page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">首页</a>\r\n");
      out.write("                    <a style=\"padding-left: 10px;padding-right: 10px;\" href=\"/student_manage?current_page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${current_page>1 ? current_page-1:1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.print("上一页 ");
      out.write("</a>\r\n");
      out.write("                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fstep_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f1_reused = false;
      try {
        _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f1.setParent(null);
        // /admin/student/manageStudent_index.jsp(129,20) name = step type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f1.setStep(1);
        // /admin/student/manageStudent_index.jsp(129,20) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f1.setBegin(1);
        // /admin/student/manageStudent_index.jsp(129,20) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page_num}", int.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).intValue());
        // /admin/student/manageStudent_index.jsp(129,20) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f1.setVarStatus("status");
        int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
          if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                        ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              boolean _jspx_th_c_005fif_005f2_reused = false;
              try {
                _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
                _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
                // /admin/student/manageStudent_index.jsp(130,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.current==current_page}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
                if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n");
                    out.write("                            <a style=\"color:#a00\" href=\"/student_manage?current_page=");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.current}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                    out.write('"');
                    out.write('>');
                    out.print(" ");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.current}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                    out.print(" ");
                    out.write("</a>\r\n");
                    out.write("                        ");
                    int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
                _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
                _jspx_th_c_005fif_005f2_reused = true;
              } finally {
                org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
              }
              out.write("\r\n");
              out.write("                        ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              boolean _jspx_th_c_005fif_005f3_reused = false;
              try {
                _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
                _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
                // /admin/student/manageStudent_index.jsp(133,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.current!=current_page}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
                int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
                if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n");
                    out.write("                            <a href=\"/student_manage?current_page=");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.current}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                    out.write('}');
                    out.write('"');
                    out.write('>');
                    out.print(" ");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.current}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                    out.print(" ");
                    out.write("</a>\r\n");
                    out.write("                        ");
                    int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
                _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
                _jspx_th_c_005fif_005f3_reused = true;
              } finally {
                org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
              }
              out.write("\r\n");
              out.write("                    ");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f1.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fstep_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f1);
        _jspx_th_c_005fforEach_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
      }
      out.write("\r\n");
      out.write("                    <a style=\"padding-left: 10px;padding-right: 10px;\"  href=\"/student_manage?current_page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${current_page<page_num ? current_page+1:page_num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.print(" 下一页");
      out.write("</a>\r\n");
      out.write("                    <a  href=\"/student_manage?current_page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page_num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">尾页</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"height:30px;line-height:30px;width: 120px;float: left;padding-left: 50px;\">\r\n");
      out.write("                    <div style=\"float: left;\">");
      out.print("到");
      out.write("</div>\r\n");
      out.write("                    <div style=\"float: left;padding-right: 10px;\">");
      out.print("第");
      out.write("</div>\r\n");
      out.write("                    <div style=\"float: left;\">\r\n");
      out.write("                        <form style=\"padding-top: 2.5px;line-height:30px;height: 25px;width: 25px;float:left\" action=\"/student_manage\" method=\"post\" name=\"form1\">\r\n");
      out.write("                            <input type=\"text\" name=\"current_page\" style=\"border:1px solid #000;line-height:30px;height: 25px;width: 25px;text-align: center\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div style=\"float: left;padding-right: 10px;padding-left: 10px;\">");
      out.print("  页");
      out.write("</div>\r\n");
      out.write("                    <a style=\"border: 1px solid #fcf5f5\" href=\"javascript:void(0)\" onclick=\"form1.submit()\">确定</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /admin/student/manageStudent_index.jsp(87,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty msg}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <div style=\"padding-left: 450px;width: 70%;height:40px;line-height:40px;overflow: hidden;margin: 0 auto;color: #aa0000\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /admin/student/manageStudent_index.jsp(104,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ not empty studentList}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                ");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /admin/student/manageStudent_index.jsp(105,16) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${studentList}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /admin/student/manageStudent_index.jsp(105,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("list");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <div style=\"padding-left: 450px;width: 70%;height:40px;line-height:40px;font-size:20px;overflow: hidden;margin: 0 auto;\">\r\n");
            out.write("                        <div style=\"\">\r\n");
            out.write("                            <div style=\"color: #000;text-align: center;\">\r\n");
            out.write("                                <div style=\"width: 10.5%;float: left;font-size:15px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\r\n");
            out.write("                                <div style=\"width: 10.5%;float: left;font-size:15px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\r\n");
            out.write("                                <div style=\"width: 15.5%;float: left;font-size:15px;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.getPhone()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\r\n");
            out.write("                                <div style=\"float: left;width: 5.5%;font-size:15px;\">|</div>\r\n");
            out.write("                                <div style=\"width: 10.5%;float: left;font-size:15px;\"><a style=\"color:#a00\" href=\"/student_info_servlet?sno=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">详情</a></div>\r\n");
            out.write("                            </div>\r\n");
            out.write("                        </div>\r\n");
            out.write("                    </div>\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
