<%--<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/15/2020
  Time: 8:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/" method="post">
<%--    <input type="text" placeholder="Enter of Number" name="leftOperand">--%>
<%--    <input type="text" placeholder="Enter Of Number" name="rightOperand"><br><br>--%>
<%--    <select name="operator">--%>
<%--        <option value="+" selected="${operator.equals('+')}">+</option>--%>
<%--        <option value="-" selected="${operator.equals('-')}">-</option>--%>
<%--        <option value="*" selected="${operator.equals('*')}">*</option>--%>
<%--        <option value="/" selected="${operator.equals('/')}">/</option>--%>
<%--    </select>--%>
<%--    <button type="submit" >Calculate</button>--%>

    <input type="text" placeholder="Enter of Number" name="number1">
    <input type="text" placeholder="Enter Of Number" name="number2"><br><br>
    <input type="submit" value="+" name="operator">
    <input type="submit" value="-" name="operator">
    <input type="submit" value="x" name="operator">
    <input type="submit" value="/" name="operator">
</form>
<h2>result:</h2>
<h3 >${result}</h3>
</body>
</html>
