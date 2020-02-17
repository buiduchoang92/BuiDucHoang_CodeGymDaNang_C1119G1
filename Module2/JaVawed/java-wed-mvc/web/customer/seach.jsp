<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/12/2020
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<html>
<head>
    <title>Seach Customer</title>
    <style>
        table{
            border: black;
        }
        tr,td{
            solid-color: black;
            border:1px red;
        }
    </style>
</head>
<body>
<h1>Seach Customer</h1>
<a href="/customers">Back To List</a>
<form method="post">
<table>
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
    </tr>
    <c:forEach items="${requestScope['customers']}" var="cutomer">
        <tr>
            <td>${cutomer.getName()}</td>
            <td>${cutomer.getEmail()}</td>
            <td>${cutomer.getAddress()}</td>
        </tr>
    </c:forEach>
</table>
</form>
</body>
</html>
