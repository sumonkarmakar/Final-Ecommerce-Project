/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.46
 * Generated at: 2017-10-13 08:46:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.*;
import java.util.*;
import org.hibernate.SessionFactory;
import javax.servlet.http.HttpServletRequest;
import com.ecommerce2.ecommercebackend.Dao.*;
import com.ecommerce2.ecommercebackend.DaoImpl.*;
import com.ecommerce2.ecommercebackend.model.*;
import com.ecommerce2.ecommercebackend.DBConfig.*;

public final class address_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-4.2.2.RELEASE.jar", Long.valueOf(1504297785151L));
    _jspx_dependants.put("jar:file:/C:/Users/Koustabh/Desktop/Ecommerce_Project-master/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ecommerce1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("jar:file:/C:/Users/Koustabh/Desktop/Ecommerce_Project-master/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ecommerce1/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1492505852000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1504029734665L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.8.RELEASE.jar", Long.valueOf(1504029726951L));
    _jspx_dependants.put("/WEB-INF/views/shared/navbar.jsp", Long.valueOf(1507881495625L));
    _jspx_dependants.put("jar:file:/C:/Users/Koustabh/Desktop/Ecommerce_Project-master/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ecommerce1/WEB-INF/lib/spring-security-taglibs-4.2.2.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1488419132000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("com.ecommerce2.ecommercebackend.DBConfig");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.security");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("com.ecommerce2.ecommercebackend.Dao");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.ecommerce2.ecommercebackend.DaoImpl");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.ecommerce2.ecommercebackend.model");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.servlet.http.HttpServletRequest");
    _jspx_imports_classes.add("org.hibernate.SessionFactory");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fclass_005fnobody;

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
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fclass_005fnobody.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\">\r\n");
      out.write("<script \r\n");
      out.write("\t src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\"#click\").click(function(){\r\n");
      out.write("\t\t\t$(\"#form\").toggle(1000);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("\tmargin-left: 35%;\r\n");
      out.write("\tmargin-bottom: 4%;\r\n");
      out.write("\tbackground-color: #65D7B3;\r\n");
      out.write("}\r\n");
      out.write(" .newAddr{\r\n");
      out.write("\tbackground-color:#65D7B3;\r\n");
      out.write("\tcolor:white;\r\n");
      out.write("\tpadding: 5px 15px 5px 15px;\r\n");
      out.write("\tborder-radius:7px;\r\n");
      out.write("\tbox-shadow:2px 2px 4px grey, -1px -1px 6px grey;\r\n");
      out.write("\tborder-style:none;\r\n");
      out.write("\tmargin-bottom: 4%;\r\n");
      out.write("\tmargin-left:8%;\r\n");
      out.write("}\r\n");
      out.write(".newAddr:hover{\r\n");
      out.write("\tbox-shadow:1px 1px 2px grey, 2px 2px 4px grey;\r\n");
      out.write("} \r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("nav {\n");
      out.write("\tbackground-color: #1b6d85;\n");
      out.write("\tcolor:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#dropdown1 {\n");
      out.write("\twidth: 140px;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tz-index: 1;\n");
      out.write("\tlist-style: none;\n");
      out.write("\tmargin-top: -0.01%;\n");
      out.write("\tmargin-left: 12%;\n");
      out.write("\tcolor: black;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tborder-bottom-left-radius: 7px;\n");
      out.write("\tborder-bottom-right-radius: 7px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tbox-shadow: 2px 2px 4px grey, -2px 2px 4px grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".order_span {\n");
      out.write("\tmargin-left: 25%;\n");
      out.write("}\n");
      out.write("#dropdown-menu1{\n");
      out.write("\twidth: 140px;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tz-index: 1;\n");
      out.write("\tlist-style: none;\n");
      out.write("\tmargin-top: -0.01%;\n");
      out.write("\tmargin-left: 12%;\n");
      out.write("\tcolor: black;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tborder-bottom-left-radius: 7px;\n");
      out.write("\tborder-bottom-right-radius: 7px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tbox-shadow: 2px 2px 4px grey, -2px 2px 4px grey;\n");
      out.write("\tdisplay:none;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("a:hover{\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t$(\"#dropdownbtn\").click(function(){\n");
      out.write("\t\t\t$(\"#dropdown1\").toggle();\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t$(\"#dropdown2\").click(function(){\n");
      out.write("\t\t\t$(\"#dropdown-menu1\").toggle();\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\" style=\"border-bottom-style: none;\">\n");
      out.write("\t<nav class=\"navbar navbar-inverse\"\n");
      out.write("\t\tstyle=\"background-color: #292F33; border-radius: 0px; color: white; height: 60px\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("\t\t\t\t\tstyle=\"height: 59px\">ShopMobiles</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a id=\"dropdown2\"\n");
      out.write("\t\t\t\t\tstyle=\"cursor: pointer;\">Select Product <span\n");
      out.write("\t\t\t\t\t\tclass=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t<ul id=\"dropdown-menu1\" >\n");
      out.write("\t\t\t\t\t\t<li style=\"margin-left: -33%; margin-top: 8%;\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/samsung\">Samsung</a></li>\n");
      out.write("\t\t\t\t\t\t<li style=\"margin-left: -33%; margin-top: 10%;\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/nokia\">Nokia</a></li>\n");
      out.write("\t\t\t\t\t\t<!-- <li style=\"margin-left: -33%; margin-top: 10%;\"><a href=\"#\">HTC</a></li> -->\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"/ecommerce1/user/view/cart\"><span\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-shopping-cart\"></span>Cart</a></li>\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_sec_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_sec_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t");
      //  sec:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      boolean _jspx_th_sec_005fauthorize_005f2_reused = false;
      try {
        _jspx_th_sec_005fauthorize_005f2.setPageContext(_jspx_page_context);
        _jspx_th_sec_005fauthorize_005f2.setParent(null);
        // /WEB-INF/views/shared/navbar.jsp(142,4) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_sec_005fauthorize_005f2.setAccess("isAuthenticated()");
        int _jspx_eval_sec_005fauthorize_005f2 = _jspx_th_sec_005fauthorize_005f2.doStartTag();
        if (_jspx_eval_sec_005fauthorize_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t<li><a id=\"dropdownbtn\" style=\"cursor: pointer\"> ");

 	Principal principal = request.getUserPrincipal();
 		if (principal != null) {
 			principal.getName();
 			out.println(principal.getName());
 		}
   
          out.write("   <span class=\"caret\"></span>\n");
          out.write("\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t\t\t<ul id=\"dropdown1\" style=\"display:none;\">\n");
          out.write("\t\t\t\t\t\t\t<li style=\"margin-left: -33%; margin-top: 6%;\"><a\n");
          out.write("\t\t\t\t\t\t\t\thref=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/user/showOrder\">Your\n");
          out.write("\t\t\t\t\t\t\t\t\tOrders");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li style=\"margin-left: -33%; margin-top: 6%;\">Your Account</li>\n");
          out.write("\t\t\t\t\t\t\t<li style=\"margin-left: -33%; margin-top: 13%;\"><a\n");
          out.write("\t\t\t\t\t\t\t\thref=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/logout\"\n");
          out.write("\t\t\t\t\t\t\t\tstyle=\"border-top: 1px solid; padding-right: 70px\">Log Out</a></li>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t</ul></li>\n");
          out.write("\t\t\t\t");
        }
        if (_jspx_th_sec_005fauthorize_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f2);
        _jspx_th_sec_005fauthorize_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f2, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f2_reused);
      }
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"registerpage\">Register<span\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-registration-mark\"></span></a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</nav>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<h2 style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${addrList}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("\t\t<div class=\"col-md-6\"\r\n");
      out.write("\t\t\tstyle=\"margin-left: 25%; background-color: white; height: auto; border: 1px solid #c7dbd1; border-radius: 7px; box-shadow: 2px 2px 2px grey, -1px 5px 20px grey\">\r\n");
      out.write("\t\t\t<table class=\"table\" style=\"border: 0px solid; margin-top: 2%;\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h3>Choose Any One Address or Add New Address</h3>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div style=\"margin-left:30%;\">\r\n");
      out.write("\t\t\t<div id=\"form\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t\t<button id=\"click\" class=\"newAddr\">Add New Address</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_sec_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f0_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f0.setParent(null);
      // /WEB-INF/views/shared/navbar.jsp(129,4) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f0.setAccess("hasAuthority('Admin')");
      int _jspx_eval_sec_005fauthorize_005f0 = _jspx_th_sec_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
        out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Admin <span class=\"caret\"></span></a>\n");
        out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"admin/product\">Product</a></li>\n");
        out.write("\t\t\t\t\t\t\t<li><a href=\"admin/supplier\">Supplier</a></li>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t</ul></li>\n");
        out.write("\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f0);
      _jspx_th_sec_005fauthorize_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f0, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f1_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f1.setParent(null);
      // /WEB-INF/views/shared/navbar.jsp(138,4) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f1.setAccess("isAnonymous()");
      int _jspx_eval_sec_005fauthorize_005f1 = _jspx_th_sec_005fauthorize_005f1.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t<li><a href=\"login\">Sign In<span\n");
        out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-log-in\"></span></a></li>\n");
        out.write("\t\t\t\t");
      }
      if (_jspx_th_sec_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f1);
      _jspx_th_sec_005fauthorize_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f1, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/address.jsp(67,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/address.jsp(67,4) '${addrList1}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${addrList1}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/address.jsp(67,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("i");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t<tbody>\r\n");
            out.write("\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t<td style=\"border-top: 0px; border-bottom: 0px;\"><a\r\n");
            out.write("\t\t\t\t\t\t\t\thref=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("/user/placeOrder/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("\t\t\t\t\t\t\t\tstyle=\"margin-left: 4%; color: black;\"><p\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"height: auto;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.shippingAddress}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p></a></td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t</tbody>\r\n");
            out.write("\r\n");
            out.write("\t\t\t\t");
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

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    boolean _jspx_th_form_005fform_005f0_reused = false;
    try {
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/views/address.jsp(81,4) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/user/addAddress", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/address.jsp(81,4) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("post");
      // /WEB-INF/views/address.jsp(81,4) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("address");
      // /WEB-INF/views/address.jsp(81,4) null
      _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", "form-horizontal");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return true;
            out.write("\r\n");
            out.write("\t\t\t\t\t<input type=\"submit\" value=\"Add\" class=\"newAddr\" style=\"margin-left: 15%; margin-top: 2%;\">\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005fclass_005faction.reuse(_jspx_th_form_005fform_005f0);
      _jspx_th_form_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_form_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    boolean _jspx_th_form_005finput_005f0_reused = false;
    try {
      _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/views/address.jsp(82,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f0.setPath("shippingAddress");
      // /WEB-INF/views/address.jsp(82,5) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", "text");
      // /WEB-INF/views/address.jsp(82,5) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "style", "width : 200px;");
      // /WEB-INF/views/address.jsp(82,5) null
      _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", "form-control");
      int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
        if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fpath_005fclass_005fnobody.reuse(_jspx_th_form_005finput_005f0);
      _jspx_th_form_005finput_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_form_005finput_005f0, _jsp_getInstanceManager(), _jspx_th_form_005finput_005f0_reused);
    }
    return false;
  }
}
