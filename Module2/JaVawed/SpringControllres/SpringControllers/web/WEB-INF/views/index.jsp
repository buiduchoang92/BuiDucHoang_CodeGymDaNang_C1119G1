<%--
Created by IntelliJ IDEA.
User: Admin
Date: 2/13/2020
Time: 3:43 PM
To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form action="/choose" method="post">
  <input type="checkbox" name="list" value="Lettuce">
  <label >Lettuce</label><br>
  <input type="checkbox" name="list" value="Tomato">
  <label >Tomato</label><br>
  <input type="checkbox" name="list" value="Mustard">
  <label >Mustard</label><br>
  <input type="checkbox" name="list" value="Sprouts">
  <label >Sprouts</label><br><br>
  <input type="submit" value="Submit">
  <p>${massage}</p>
</form>
</body>
</html>
