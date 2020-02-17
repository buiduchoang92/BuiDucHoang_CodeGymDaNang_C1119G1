<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/15/2020
  Time: 8:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<header>
    <div class="navbar navbar-default navbar-fixed-top text-uppercase">
        <div class="container">
            <div class="navbar-header">
                <a href="/" class="navbar-brand">Calculator</a>
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
        </div>
    </div>
</header>
<div class="container body-content span=8 offset=2">
    <div class="well">
        <main th:include="${view}"></main>
    </div>
</div>
</body>
</html>
