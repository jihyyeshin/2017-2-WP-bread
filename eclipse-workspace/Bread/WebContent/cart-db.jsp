<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.text.*" %>
<% request.setCharacterEncoding("euc-kr"); %>
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
            <div id="part1">
    <%
      int temp = 0, cnt;
      int new_id = 0,ref=0;
      String yourname,password,bread,date,number,reply;
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
      String sql_update;

      try {
          Class.forName("com.mysql.jdbc.Driver");
          String jdbcurl = "jdbc:mysql://localhost:3306/bread_order";
          conn = DriverManager.getConnection(jdbcurl, "root", "1015");
          stmt = conn.createStatement();
          String sql = "select max(id) as max_id, count(*) as cnt from bread_order";
          rs = stmt.executeQuery(sql);
      }

      catch(Exception e) {
               out.println("DB 연동 오류입니다. : " + e.getMessage());
         }

     while(rs.next()) {
         cnt = Integer.parseInt(rs.getString("cnt"));
         if(cnt != 0)
           new_id = Integer.parseInt(rs.getString("max_id"));
     }

     new_id++;
     yourname = request.getParameter("yourname");
     password = request.getParameter("password");
     bread = request.getParameter("bread");
     date = request.getParameter("date");
     number = request.getParameter("number");
     reply = request.getParameter("reply");

     if("y".equals(reply)) {
            ref = Integer.parseInt(request.getParameter("ref"));
     } else {
            ref = new_id;
     }
     
     sql_update = "insert into bread_order values (" + new_id + ",'"+ yourname + "','" +
     password + "','" + bread + "','" + date + "','" + number + "'," + ref + ")";

     try {
            stmt.executeUpdate(sql_update);
     }
     catch(Exception e) {
         out.println("DB 연동 오류입니다. : "+ e.getMessage());
     }
     %>

     		<center>
     		<p class = "p7"><br> Order completed successfully :)
		<br><br>Go to the Order Page<br>and<br>Check Your Order! </p><br><br>
     		<p class = "p7"><a href ="home.jsp"> Go to the Home Page</a> &nbsp;&nbsp;&nbsp;
     		<a href ="order.jsp"> Go to the Order Page</a><br><br></p>
     		</center>
            </div>
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