<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/15/2020
  Time: 6:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculation</title>
  </head>
  <body>
  <h2>Caculation</h2>
  <p>Result: </p>
  <form action="location" method="post">
    <input type="text" placeholder="Enter of Number" name="number1">
    <input type="text" placeholder="Enter Of Number" name="number2"><br><br>
    <input type="submit" value="Addtion(+)" name="+">
    <input type="submit" value="Subtraction(-)" name="-">
    <input type="submit" value="Multiplication(x)" name="*">
    <input type="submit" value="Division(/)" name="/">
  </form>
  </body>
</html>
