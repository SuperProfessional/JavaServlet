<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Kết Quả</title>
</head>
<body>
<h1>Thông tinh đăng ký</h1>
<ul>
    <li>Tên đăng nhập: <b>${username}</b></li>
    <li>Mật khẩu: <b>${password}</b></li>
    <li>Giới tính:
        <c:choose>
            <c:when test="${gender}">
                <b>Nam</b>
            </c:when>
            <c:otherwise>
                <b>Nữ</b>
            </c:otherwise>
        </c:choose>
    </li>
    <li>Tình trạng hôn nhân:
        <c:choose>
            <c:when test="${married}">
                <b>Đã kết hôn</b>
            </c:when>
            <c:otherwise>
                <b>Đang ế</b>
            </c:otherwise>
        </c:choose></li>
    <li>Quốc tịch: <b>${country}</b></li>
    <li>Sở thích: <b>${hobbies}</b></li>
    <li>Ghi chú: <b>${notes}</b></li>
</ul>
</body>
</html>
