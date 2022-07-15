<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hình Chữ Nhật</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/chu-nhat" method="post">
    Chieu Dai:  <input type="number" name="dai" min="1"><br><br>
    Chieu Rong: <input type="number" name="rong" min="1"><br>
    <button>Tinh</button>
</form>
</body>
</html>
