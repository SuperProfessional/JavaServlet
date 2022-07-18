<%--
  Created by IntelliJ IDEA.
  User: ghoul
  Date: 5/17/22
  Time: 8:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tam Giác</title>
</head>
<body>
<h1>TAM GIÁC</h1>
<form action="${pageContext.request.contextPath}/tam-giac" method="post">
    <input type="number" name="a" min="1" placeholder="Cạnh a?"><br><br>
    <input type="number" name="b" min="1" placeholder="Cạnh b?"><br><br>
    <input type="number" name="c" min="1" placeholder="Cạnh c?"><br><br>
    <hr>
    <button formaction="${pageContext.request.contextPath}/dien-tich">Tinh diện tích </button>
    <button formaction="${pageContext.request.contextPath}/chu-vi">Tinh chu vi </button>
    <br>
    <h1>${message}</h1>
</form>
</body>
</html>
