<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/7/2020
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <h2>Currency Converter</h2>
  <form action="/convert" method="get">
    <label>Rate: </label><br/>
    <input type="text" name="rate" value="22000" placeholder="RATE"><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" ><br/>
    <input type="submit" value="Converter">
  </form>
  </body>
</html>
