<%--
  Created by IntelliJ IDEA.
  User: super
  Date: 2017/8/30
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="login" method="post">
    <input name="user_name" required placeholder="username">
    <input type="password" name="user_password" required placeholder="password">
    <input type="submit" value="login">
</form>
</body>
</html>