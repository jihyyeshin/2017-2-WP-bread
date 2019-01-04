<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>Mr.Bread</title>
</head>

<body>
    <link rel="stylesheet" type="text/css" href="style.css"/>
    <div id="container">
        <div>
            <ul class="h">
                <li class="h"><a class="h" href="home.jsp">HOME</a></li>
                <li class="h"><a class="h" href="content.jsp">CONTENT</a></li>
                <li class="h"><a class="h" href="order.jsp">ORDER</a></li>
                <li class="h"><a class="h" href="about.jsp">ABOUT</a></li>
            </ul>
        </div>
        <br /><br /><br />
        <div id="main">
	<br />
        <center>
          <p class="p1">Notice</p>
          <hr width="9%" style="border: 1px solid darkred" />
	  <br />
	  <p class="p4">Please check the notices raised by the admin.</p><br />
        <table border="0" align="center" width="700" bgcolor="antiquewhite">
        <tr>
	  <td align="center" bgcolor="#b76d39" width="50"><p class="three">list</p></td>
	  <td align="center" bgcolor="#b76d39" width="200"><p class="three">title</p></td>
	  <td align="center" bgcolor="#b76d39" width="100"><p class="three">date</p></td>
        </tr>
        <%		
         int id, ref;
         int rownum = 0;
         Connection conn = null;
         Statement stmt = null;
         String sql = null;
         ResultSet rs = null;

         try {
               Class.forName("com.mysql.jdbc.Driver");
               String jdbcurl = "jdbc:mysql://localhost:3306/notice_list";
               conn = DriverManager.getConnection(jdbcurl, "root", "1015");
               stmt = conn.createStatement();
               sql = "select * from notice_list order by ref desc, id asc ";
               rs = stmt.executeQuery(sql);
         }
         catch(Exception e) {
               out.println("DB 연동 오류입니다. : " + e.getMessage());
         }

	 rs.last();
	 rownum = rs.getRow();
         rs.beforeFirst();
      
  	 while(rs.next())
	 {
		id = Integer.parseInt(rs.getString("id"));
	        ref = Integer.parseInt(rs.getString("ref"));
        %>
        <tr>
          <td align="center"> <%= rownum %></td>
          <td align="center"> <a href=notice_read.jsp?id=<%=rs.getString("id")%>>
		<%= rs.getString("title") %></td>
          <td align="center"> <%= rs.getString("date") %></td>
        </tr>

       <%
	       rownum--;
	  }
       %>

       </table><br /><br /><br />
       </center>
            <div id="part2">
                <div>
                    <marquee width="auto" direction="right" behavior="scroll" scrollamount="7" scrolldelay="10" loop="10" hspace="5" vspace="5">
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
    <% 
       stmt.close();
       conn.close();
    %> 
</body>
</html>