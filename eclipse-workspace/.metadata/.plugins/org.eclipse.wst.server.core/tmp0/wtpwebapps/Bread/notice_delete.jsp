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
    <%
       int id;
       String sql, sql1;
       Connection conn = null;
       Statement stmt = null;
       ResultSet rs = null;
       id = Integer.parseInt(request.getParameter("id"));
   
       try { 
             Class.forName("com.mysql.jdbc.Driver");
	     String url = "jdbc:mysql://localhost:3306/notice_list";
	     conn = DriverManager.getConnection(url, "root", "1015");
	     stmt = conn.createStatement();
             sql = "select * from notice_list where id = " + id;
             rs = stmt.executeQuery(sql);
       }
       catch(Exception e) {
             out.println("DB 연동 오류1입니다. : " + e.getMessage());
       }
		sql1 = "delete from notice_list where id = " + id;
		try { 		     
		    stmt.executeUpdate(sql1); 
		}  
		catch(Exception e) {
		    out.println("DB 연동 오류2입니다. : " + e.getMessage());
		}
    %>

    <p class="p1">Deleted</p>
    <hr width="10%" style="border: 1px solid darkred" /> <br>
    <p class="p4">Notice has been Deleted.</p><br><br>
    <p class="p4"><a href="notice_admin.jsp"> Go to the Notice Page </a> &nbsp;&nbsp;&nbsp;
    <a href="homelogin.jsp">Go to the Home Page </a></p><br><br>
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
</body>
</html>