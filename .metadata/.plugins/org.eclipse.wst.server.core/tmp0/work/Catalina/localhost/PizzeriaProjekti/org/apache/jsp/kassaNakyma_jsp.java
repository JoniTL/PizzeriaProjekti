/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-02-25 18:51:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;
import java.util.ArrayList;
import fi.pizzeriaprojekti.admin.bean.*;

public final class kassaNakyma_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("fi.pizzeriaprojekti.admin.bean");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Locale");
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("java.text.NumberFormat");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Fiori e Castello - Kassa</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#seuraava {\r\n");
      out.write("\tbackground: lightgreen;\r\n");
      out.write("\tfont-size: 1.2em;\r\n");
      out.write("\tborder: 1px solid grey;\r\n");
      out.write("\tpadding: 8px 15px;\r\n");
      out.write("\twidth: 115px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#frm3_submit {/*takaisin nappi*/\r\n");
      out.write("\tbackground: #E74C3C;\r\n");
      out.write("\tfont-size: 1.2em;\r\n");
      out.write("\tborder: 1px solid grey;\r\n");
      out.write("\tpadding: 8px 15px;\r\n");
      out.write("\twidth: 115px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!---------------------------------------tilausyhteenveto begins here -------------------------------->\r\n");
      out.write("\t");

	Locale locale  = new Locale("fi", "FI");
	String pattern = "##0.00";
	DecimalFormat desi = (DecimalFormat) NumberFormat.getNumberInstance(locale);
	desi.applyPattern(pattern);
	
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-12 col-md-12\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Tuote</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Lukumäärä</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text-center\">Hinta/kpl</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text-center\">Summa</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<th> </th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

						double maksyht = 0;
							if(session != null && session.getAttribute("kori")!=null ) {
							            	ArrayList<ostoskoriPizza> ostoskoriPizzat = (ArrayList<ostoskoriPizza>)session.getAttribute("kori");
							            	
						                
						                for (int i = 0; i< ostoskoriPizzat.size(); i++){
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"col-sm-8 col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"thumbnail pull-left\" href=\"#\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"media-object\" src=\"img/minipizza.png\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4 class=\"media-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

													out.print(ostoskoriPizzat.get(i).getNimi());
												
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"col-sm-1 col-md-1 text-center\"><strong>");
out.print(ostoskoriPizzat.get(i).getLkm()); 
      out.write("</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"col-sm-1 col-md-1 text-center\"><strong>");
out.print(desi.format(ostoskoriPizzat.get(i).getHinta()));
      out.write(" €</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t");
 double summa = ostoskoriPizzat.get(i).getLkm() * ostoskoriPizzat.get(i).getHinta(); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"col-sm-1 col-md-1 text-center\"><strong>");
out.print(desi.format(summa));
      out.write(" €</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"col-sm-1 col-md-1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"ostoskoriController\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" class=\"btn btn-xs btn-danger pull-right\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"action2\" value=\"poistakorista\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"pizzanumero\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
out.print(ostoskoriPizzat.get(i).getId());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-xs btn-danger pull-right\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tx\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

						maksyht = maksyht + summa;
						
							}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><h1>Tarkista tuotteet:</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Poista tuotteita painamalla punaista ruksia tai palaa takaisin lisäämään puuttuvat tuotteet.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Kun olet tyytyväinen tilauksen sisältöön, niin jatka tilausta painamalla \"Seuraava\". </p>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Yhteensä:\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"ostoskoriController\" method=\"get\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<b> ");
 out.print(desi.format(maksyht)); 
      out.write("€</b>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"action\" value=\"jatka\" />\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"maksyht\" value=\"");
 out.print(maksyht);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" id=\"seuraava\">Seuraava</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<form action=\"TilausController\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Takaisin\" name=\"Submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"frm3_submit\" /> \r\n");
      out.write("\t\t\t\t\t\t\t\t</form> \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!----------------------------tilausyhteenveto ends here ------------------------------------------->\r\n");
      out.write("\t<script src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/index.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
