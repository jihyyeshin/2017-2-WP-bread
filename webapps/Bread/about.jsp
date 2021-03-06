<%@ page language="java" contentType="text/html; charset=euc-kr"
   pageEncoding="euc-kr"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title>Mr.Bread</title>

<script language="javascript">
   function changeMap() {
      if (map.style.visibility == "visible")
         map.style.visibility = "hidden";
      else
         map.style.visibility = "visible";
   }
</script>

</head>

<body>
   <link rel="stylesheet" type="text/css" href="style.css" />
   <div id="container">
      <div>
         <ul class="h">
            <li class="h"><a class="h" href="home.jsp">HOME</a></li>
            <li class="h"><a class="h" href="content.jsp">CONTENT</a></li>
            <li class="h"><a class="h" href="order.jsp">ORDER</a></li>
            <li class="h"><a class="h" href="about.jsp">ABOUT</a></li>
         </ul>
      </div>
      <br /> <br /> <br />
      <div id="main">
         <br />
         <p class="p1">Brand Story</p>
         <hr width="15%" style="border: 1px solid darkred" />
         <table border="0" align="center">
            <tr>
               <td><img class="img1" src="21.jpg" /></td>
               <td>
                  <div id="p2">
                     <p class="p2">
                        Healthy baked goods <br /> with the purest and <br /> finest
                        ingredients. <br /> <br /> Mr.Bread : <br /> A European
                        styled bakery- <br /> A friendly service to your home, your
                        family, <br /> and to your neighbors. <br /> <br />
                        Mr.Bread's bread : <br /> Baked like your fathers goods�� <br />
                        only with fresh and pure <br /> natural ingredients <br />
                     </p>
                  </div>
               </td>
            </tr>
            <tr>
               <td>
                  <div id="p3">
                     <p class="p3">
                        Mr.Bread is a group of people <br /> who are passionate some
                        would say, <br /> obsessed with creating <br /> exceptional
                        artisan breads. <br /> <br /> It��s why we find carefully
                        sourced, <br /> top-quality ingredients, used according to <br />
                        recipes and processes that <br /> have been perfected over
                        generations. <br /> <br /> Read on to learn about <br /> our
                        incredibly detailed approach. <br />
                     </p>
                  </div>
               </td>
               <td><img class="img2" src="20.jpg" /></td>
            </tr>
         </table>
         <hr width="98%" style="border: 0.5px solid #b76d39" />
         <br /> <br />
         <p class="p1">Location</p>
         <hr width="11%" style="border: 1px solid darkred" />
         <br> <br> <br>
         <table border="0" align="center" width="700">
            <tr>
               <td>
                  <center>
                     <p class="p5">Address : 23-2, Bangi-dong, Songpa-gu, Seoul,
                        Korea</p>
                  </center>
               </td>
            </tr>
            <tr>
               <td>
                  <center>
                     <center>
                        <br><p class="p5">need any map?</p>
                     </center>
                     <input type="checkbox" name="ck" value="2" onclick="changeMap()" />

                     <div id="map">
                        <img src="map.jpg" width="700" height="480" />
                     </div>
                  </center>
               </td>
            </tr>
         </table>
      </div>
   </div>
   </div>
</body>
</html>