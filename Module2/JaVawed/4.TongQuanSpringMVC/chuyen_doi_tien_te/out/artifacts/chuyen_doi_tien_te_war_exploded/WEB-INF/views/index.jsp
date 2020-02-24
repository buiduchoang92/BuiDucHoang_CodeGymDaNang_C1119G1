<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/13/2020
  Time: 8:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ChuyenDoiTienTe</title>
  </head>
  <body>
  <form action="/exchange" method="post">
  <h2>GiaChenhLech</h2>
  <input type="text"value="22000" name="rates">
  <h2>USD</h2>
  <input type="text" placeholder="Enter USD" name="usd">
    <input type="submit" name="OK">
    <input type="text" value="${vnd}">
  </form>
  </body>
</html>
