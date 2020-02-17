<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/10/2020
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2>Currency Converter</h2>
  <form action="index.jsp" method="post">
    <label>Rate: </label><br>
    <input type="text" value="22000" placeholder="RATE" name="rate"><br>
    <label>USD: </label><br>
    <input type="text" placeholder="USD" name="usd"><br>
    <input type="submit" value="Converter" id="submit">
  </form>
  </body>
</html>
