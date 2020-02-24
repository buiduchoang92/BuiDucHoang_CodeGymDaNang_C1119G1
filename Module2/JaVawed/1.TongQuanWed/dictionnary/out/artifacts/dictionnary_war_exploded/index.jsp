<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/7/2020
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Vietnamese Dictionary</title>
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form action="/translate" method="post">
    <input type="search" placeholder="enter search" name="txtsearch">
    <input type="submit" value="Search">
  </form>
  </body>
</html>
