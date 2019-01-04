<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <!-- calendar -->
    <link rel="stylesheet"
     href="//code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css"
     type="text/css">
    <script
     src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
    <script type="text/javascript">
     $(function() {
       $("#date1").datepicker();
     });
    </script>
<title>Mr.Bread</title>
</head>

<body>
    <link rel="stylesheet" type="text/css" href="style.css"/>
    <div id="container">
        <div>
            <ul class="h">
                <li class="h"><a class="h" href="homelogin.jsp">HOME</a></li>
                <li class="h"><a class="h" href="content.jsp">CONTENT</a></li>
                <li class="h"><a class="h" href="order.jsp">ORDER</a></li>
                <li class="h"><a class="h" href="about.jsp">ABOUT</a></li>
            </ul>
        </div>
        <br /><br /><br />
        <div id="main">
	  <br />
          <center>
            <p class="p1">New Notice</p>
            <hr width="15%" style="border: 1px solid darkred" />
	    <br />
  	    <form action="notice_insert_db.jsp" method="post">
    	      <table border="0">		
		<tr>
	          <td align="center" bgcolor="#b76d39" width="80"><p class="three">title</p></td>
	          <td><input type="text" name="title" size="78"></td>
    		</tr>
    		<tr>
	          <td align="center" bgcolor="#b76d39"><p class="three">date</p></td>
	          <td><input type="text" name="date" id="date1" size="78"></td>
    		</tr>
    		<tr>
     		  <td valign="top" align="center" bgcolor="#b76d39"><p class="three">content</p></td>
     		  <td><textarea name="content" rows="10" cols="80"></textarea></td>
    		</tr>
    	      </table><br><br>

	      <input type="submit" value="upload" class="button button2"/>
              <input type="reset" value="rewrite" class="button button2"/>

     	      <% 
		String flag = request.getParameter("flag");
		if("r".equals(flag)){ %>
		  <input type="hidden" name="ref" value="<%= request.getParameter("ref") %>">
		  <input type="hidden" name="reply" value="y">
    	      <% } else %>
	      <input type="hidden" name="reply" value="n">
    	    </form>
	  <br /><br />
	  <p class="p5"><a href="notice_admin.jsp">Go to the Notice Page</a> &nbsp;&nbsp;&nbsp;
   	  <a href="homelogin.jsp">Go to the Home Page</a></p><br><br>
          </center>
            <div id="part2">
                <div>
                    <marquee width="auto" direction="right" behavior="scroll" scrollamount="7" scrolldelay="10" 			loop="10" hspace="5" vspace="5">
                        <img src="1.jpg">
                        <img src="4.jpg">
                        <img src="2.jpg">
                        <img src="3.jpg">
                        <img src="5.jpg">
                    </marquee>
                </div>
            </div>
        </div>
    </div> 
</body>
</html>