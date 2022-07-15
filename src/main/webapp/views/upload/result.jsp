<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ghoul
  Date: 7/14/22
  Time: 11:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<div>
    <h2>1. Hình: ${img.name}</h2>
    <img src="<c:url value="/upload/${img.name}"/>" style="height: 500px">
    <h2>2. Tài liệu: ${doc.name}</h2>
    <a href="<c:url value="/upload/${doc.name}"/>">Tải về</a>
</div>
</body>
</html>
