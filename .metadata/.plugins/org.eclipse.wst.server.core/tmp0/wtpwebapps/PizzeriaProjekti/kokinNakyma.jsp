<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.awt.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="fi.pizzeriaprojekti.admin.bean.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta charset="utf-8">
<script src="js/jquery-2.1.4.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/kokkityyli.css"   rel="stylesheet"   type="text/css">
	<script src="js/bootstrap.min.js"></script>
<script src="js/admin.js"></script>
<title>Tilaukset</title>

</head>
<body>
 
<div id="load_me"></div>
 
        <%
                //allow access only if session exists
        if(session.getAttribute("user") == null){
            response.sendRedirect("login.jsp");
        }
        String userName = null;
        String sessionID = null;
        Cookie[] cookies = request.getCookies();
        if(cookies !=null){
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("user")) userName = cookie.getValue();
        }
        }
        %>
        
        <ul class="nav navbar-default nav-tabs navbar-fixed-top">

        <!---------------------------- nav bar -------------------------------->

  <li>  
   <a href="http://proto293:8080/PizzeriaProjekti/Controller">Admin</a>
  </li>
  <li class="active">
      <a href="http://proto293:8080/PizzeriaProjekti/kokkiController">Tilausnäkymä</a> </li> 
  <li><a href="http://proto293:8080/PizzeriaProjekti/ClientController" target="_blank">Asiakasnäkymä</a> </li>
  <li><a href="http://proto293:8080/PizzeriaProjekti/TilausController" target="_blank">OnlineTilausnäkymä</a> </li>  
  <li><div class="kokki">
		<form action="LogoutServlet" method="post">
		<input type="submit" value="Kirjaudu ulos" id="logout">
		</form>
		
	</div> 
	
	</li>
</ul>

		<!----------------------------End nav bar-------------------------------->
		
		
		
		<!---------------------------- show tilaukset & show vanhat tilaukset button-------------------------------->
                <div class="tilaukset">
			 		<div class="row">
			 			<div class="col-md-6">
                        <h1>Tilaukset</h1>
                        </div>
         				<div class="col-md-offset-8">
        				<form action="kokkiController" method="get">
        				<input type="hidden" name="action2" value="naytaVanhat">
        				<button type="submit" class="vanhatNayta">Näytä vanhat tilaukset</button>
       					 </form>
       				 </div>
        		</div>
        		
                        <table>
 
                <thead>
                        <tr>
                                <td><b>Tilaus ID</b></td>
                                <td><b>Tilaaja</b></td>
                                <td><b>Puhelin</b></td>
                                <td><b>Päivämäärä</b></td>
                                <td><b>Kellonaika</b></td>
                                <td><b>Tilauksen summa</b></td>
                                <td><b>Kommentti</b></td>
                                <td><b>Pizza</b></td>
                                <td><b>Lukumäärä</b></td>
                                <td><b>Kuittaus</b></td>
                        </tr>
                </thead>
                <tbody>
 
                        <%
		                        Locale locale  = new Locale("fi", "FI");
		                    	String pattern = "##0.00";
		                    	DecimalFormat desi = (DecimalFormat) NumberFormat.getNumberInstance(locale);
		                    	desi.applyPattern(pattern);
                        		
                                
                               
                                ArrayList<Tilaukset> tilaukset = (ArrayList<Tilaukset>) request.getAttribute("tilaukset");                                                              
                                                             
                                for (int i = 0; i < tilaukset.size(); i++) {
                                		double summa = 0;
                                        out.print("<form action=\"kokkiController\" method=\"get\">");
                                        out.println("<tr>");
                                        out.println("<td>" + tilaukset.get(i).getTilausId() + "</td>");
                                        out.println("<td>" + tilaukset.get(i).getTilaaja() + "</td>");
                                        out.println("<td>" + tilaukset.get(i).getPuhnro() + "</td>");
                                        out.println("<td>" + tilaukset.get(i).getPvm() + "</td>");
                                        out.println("<td>" + tilaukset.get(i).getKlo() + "</td>");
                                        out.println("<td>" + desi.format(tilaukset.get(i).getSumma()) + "€</td>");
                                        out.println("<td>" + tilaukset.get(i).getKommentt() + "</td>");                                        
                                        ArrayList<ostoskoriPizza> tuotteet = (ArrayList<ostoskoriPizza>)tilaukset.get(i).getTuotteet(); // tässä tilaus.get(i) ei muutu 0:sta loopin jatkuessa
                                        out.println("<td>");
                                        for (int j = 0; j < tuotteet.size(); j++) {                                                                                            
                                                double rivihinta = tuotteet.get(j).getLkm() * tuotteet.get(j).getHinta();                                                
                                        		out.println("<b><p>"+ tuotteet.get(j).getNimi()+ "</p></b><br><br>");
                                        }
                                        out.println("</td>");
                                        out.println("<td>");
                                        for (int k = 0; k < tuotteet.size(); k++) {                                                                                            
                                            double rivihinta = tuotteet.get(k).getLkm() * tuotteet.get(k).getHinta();
                                           out.println("<b><p>"+tuotteet.get(k).getLkm()+ " kpl </b></p><br>");                           
                                    }
                                    out.println("</td>");
                                        
                                        out.println("<input type=\"hidden\" name=\"action\" value=\"kuittaa\"/>");
                                        out.println("<input type=\"hidden\" name=\"tilausnumero\" value=\""+tilaukset.get(i).getTilausId()+"\"/>");
                                        out.println("<td><button class=\"nappi\" type=\"submit\">Kuittaa</button></td>");
                                        out.println("</tr>");
                                        out.println("</form>");
                                }
        %>
        </tbody>
        </table>

        </div>
  <!----------------------------End show tilaukset & show vanhat tilaukset button-------------------------------->
 	<div class="row" id="vali">
 	
 	   
 		<div class="col-md-2">
        <form action="Controller" method="get">
                <input type="submit" value="Takaisin Adminnäkymään" name="Submit" id="frm2_submit" />
        </form>
    	</div>
      
     </div>   
                     
    <!----------------------------Show vanhat tilaukset & hide vanhat tilaukset button-------------------------------->     
        <table class="vanhatTable">
        
        
        <% 
              if (request.getAttribute("vanhat") != null){
                                ArrayList<Tilaukset> vanhat = (ArrayList<Tilaukset>) request.getAttribute("vanhat");
                                out.print("<div class=\"row\">");
                                	out.println("<div class=\"col-md-6\" id=\"vanhaId\">");
                                	out.println("<h1>Vanhat Tilaukset</h1>");
                                	out.println("</div>");
                                	out.println("<div class=\"col-md-offset-7\">");
                                	out.println("<form action=\"kokkiController\" method=\"get\">");
                                	out.println("<input type=\"hidden\" name=\"action2\" value=\"piilotaVanhat\">");
                                	out.println("<button type=\"submit\" class=\"vanhatPiilota\">Piilota vanhat tilaukset</button>");
                                	out.println("</form>");
                                	 out.println("</div>");
                                out.println("</div>");
                                
                                
                                for (int i = 0; i < vanhat.size(); i++) {
                                		double summa = 0;
                                        out.print("<form action=\"kokkiController\" method=\"get\">");
                                        out.println("<tr>");
                                        out.println("<td>" + vanhat.get(i).getTilausId() + "</td>");
                                        out.println("<td>" + vanhat.get(i).getTilaaja() + "</td>");
                                        out.println("<td>" + vanhat.get(i).getPuhnro() + "</td>");
                                        out.println("<td>" + vanhat.get(i).getPvm() + "</td>");
                                        out.println("<td>" + vanhat.get(i).getKlo() + "</td>");
                                        out.println("<td>" + desi.format(vanhat.get(i).getSumma()) + "</td>");
                                        out.println("<td>" + vanhat.get(i).getKommentt() + "</td>");
                                        ArrayList<ostoskoriPizza> tuotteet = (ArrayList<ostoskoriPizza>)vanhat.get(i).getTuotteet(); // tässä tilaus.get(i) ei muutu 0:sta loopin jatkuessa
                                        System.out.println(tuotteet.toString());
                                        out.println("<td>");
                                        for (int j = 0; j < tuotteet.size(); j++) {                                         	
                                                double rivihinta = tuotteet.get(j).getLkm() * tuotteet.get(j).getHinta();
                                                out.println("<b><p>"+ tuotteet.get(j).getNimi()+ "</p></b><br>");        
                                        }
                                        out.println("</td>");                                                                               
                                        out.println("<td width=\"30%px\">");
                                        for (int j = 0; j < tuotteet.size(); j++) {  
                                                double rivihinta = tuotteet.get(j).getLkm() * tuotteet.get(j).getHinta();
                                                out.println("<b><p>"+tuotteet.get(j).getLkm()+ " kpl </p></b><br>");                                             
                                        }
                                        out.println("</td>");
                                        out.println("</tr>");
                                        out.println("</form>");
                                }
              }
        %>
        
        </table>
        <!----------------------------End vanhat tilaukset & hide vanhat tilaukset button--------------------------------> 
           <script>
           
           if ( $('#vanhaId').length ) {/*onko div olemassa*/
       	    	$('html,body').animate({/*on olemassa == siirr� n�kym� .vanhatTable classiin*/
    	       	 	scrollTop: $(".vanhatTable").offset().top},
    	        	'slow');
        	}
           
           setTimeout(function(){
                   window.location.reload(1);
                }, 30000);
           
                </script>
       
 
</body>
</html>