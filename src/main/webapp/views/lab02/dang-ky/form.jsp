<%--
  Created by IntelliJ IDEA.
  User: ghoul
  Date: 5/18/22
  Time: 9:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng Ký</title>
</head>
<body>
<h1>Đăng Ký</h1>
<form action="${pageContext.request.contextPath}/dang-ky" method="post">
    Tên đăng nhập: <input type="text" name="username"><br>
    Mật khẩu: <input type="password" name="password"><br>
    Giới tính:
    <input type="radio" name="gender" value="true">Nam
    <input type="radio" name="gender" value="false">Nữ <br>
    <input type="checkbox" name="married"> Đã có gia đình?<br>
    Quốc tịnh <select name="country">
    <option value="VN">Việt Nam</option>
    <option value="US">United States</option>
</select><br>
    <input name="hobbies" type="checkbox" value="R">Đọc sách
    <input name="hobbies" type="checkbox" value="T">Du lịch
    <input name="hobbies" type="checkbox" value="M">Âm nhạc
    <input name="hobbies" type="checkbox" value="O">Khác<br>
    Ghi chú: <textarea name="notes" cols="20" rows="5"></textarea>
    <hr>
    <button>Đăng ký</button>
</form>
</body>
</html>
