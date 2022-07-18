<%--
  Created by IntelliJ IDEA.
  User: ghoul
  Date: 7/15/22
  Time: 5:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send Mail</title>
</head>
<body>
<h1>Send Mail</h1>
<mark>${message}</mark>
<form action="${pageContext.request.contextPath}/send-mail" method="post">
    To: <input name="to" type="email"><br>
    Subject: <input name="subject" type="text"><br>
    Body: <textarea rows="10" cols="39" name="content"></textarea>
    <hr>
    <button>Login</button>
</form>
</body>
</html>
