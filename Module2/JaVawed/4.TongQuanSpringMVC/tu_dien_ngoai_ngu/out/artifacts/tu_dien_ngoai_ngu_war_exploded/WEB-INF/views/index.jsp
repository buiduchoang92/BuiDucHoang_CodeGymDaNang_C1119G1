<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/13/2020
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionnary</title>
  </head>
  <body>
 <h1>Dictionnary</h1>
  <form action="/1" method="post">
      <p>${masage1}</p>
      <input type="text" name="englisk" placeholder="Enter to vocabulary">
      <input type="submit" value="translate">
      <input value="${masage}">
  </form>
  </body>
</html>
