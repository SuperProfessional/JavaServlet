<%--
  Created by IntelliJ IDEA.
  User: ghoul
  Date: 7/15/22
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Result</title>
</head>
<body>
<div>
    <h1>Thông tin nhân viên</h1>
    <ul>
        <li>Họ và tên: <b>${staff.name}</b></li>
        <li>Ngày sinh: <b><fmt:formatDate value="${staff.birthday}"
                                          pattern="yyyy-MM-dd" /></b></li>
        <li>Giới tính: <c:choose>
            <c:when test="${staff.gender}">
                <b>Nam</b>
            </c:when>
            <c:otherwise>
                <b>Nữ</b>
            </c:otherwise>
        </c:choose></li>
        <li>Quốc tịch: <b>${staff.country}</b></li>
        <li>TT hôn nhân: <c:choose>
            <c:when test="${staff.married}">
                <b>Đã kết hôn</b>
            </c:when>
            <c:otherwise>
                <b>Đang ế</b>
            </c:otherwise>
        </c:choose>
        </li>
        <li>Sở thích: <c:forEach items="${staff.hobbies}" var="x">
            <c:choose>
                <c:when test="${x == 'R'}">
                    <b>Đọc sách </b>
                </c:when>
                <c:when test="${x == 'T'}">
                    <b>Du lịch </b>
                </c:when>
                <c:when test="${x == 'M'}">
                    <b>Âm nhạc </b>
                </c:when>
                <c:otherwise>
                    <b>Khác </b>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        </li>
        <li>Ghi chú: <b>${staff.notes}</b></li>
    </ul>
</div>
</body>
</html>
