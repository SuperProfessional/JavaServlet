<%--
  Created by IntelliJ IDEA.
  User: ghoul
  Date: 7/15/22
  Time: 5:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Login</title>
</head>
<body>
<h1>LOGIN</h1>
<mark>${message}</mark>
<form action="${pageContext.request.contextPath}/login" method="post">
  Username: <input type="text" name="username" value="${username}"><br>
  Password: <input name="password" type="password"><br>
  <input name="remember" type="checkbox">Remember me?
  <hr>
  <button>Login</button>
</form>
</body>
</html>
