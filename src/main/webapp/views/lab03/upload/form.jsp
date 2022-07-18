<%--
  Created by IntelliJ IDEA.
  User: ghoul
  Date: 7/14/22
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload file</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    <h1>Upload</h1><br>
    Hình ảnh: <input type="file" name="photo" placeholder="Enter photo"><br>
    Tài liệu: <input type="file" name="docx" placeholder="Enter docx"><br>
    <hr>
    <button>Upload</button>
</form>
</body>
</html>
