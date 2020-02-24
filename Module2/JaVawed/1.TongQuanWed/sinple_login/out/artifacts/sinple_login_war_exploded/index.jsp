<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/6/2020
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
    login {
        height: 180px;
        width: 230px;
        margin: 0;
        padding: 10px;
        border: 1px #CCC solid;
    }

    login input {
        padding: 5px;
        margin: 5px;
    }
</style>
<body>
<form method="get" action="/login">
    <div class="login">
        <h2>Login</h2>
        <input type="text" name="usename" size="30" placeholder="usename1"/>
        <input type="password" name="password" size="30" placeholder="password"/>
        <input type="submit" value="Sign in"/>
    </div>
</form>
</body>
</html>
