<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/13/2020
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Home</h1>
<form:form action="/login" method="post" modelAttribute="login">
    <table>
        <tr>
            <td><form:label path="account"></form:label>Account</td>
            <td><form:input path="account"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="password"></form:label>Password</td>
            <td><form:input path="password"></form:input></td>
        </tr>
        <tr>
            <td><form:button>Login</form:button></td>
        </tr>
    </table>
</form:form>
</body>
</html>
