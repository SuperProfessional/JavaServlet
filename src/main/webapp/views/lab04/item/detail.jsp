<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <title>Detail</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="card" style="width: 400px;">
        <div class="card-header">
            <a>Ten san pham</a>
        </div>
        <div class="card-body">
            <div class="col">
                <img src="${item.image}" alt="" style="height: 300px;">
                <ul>
                    <li>Gia goc: <strike>${item.price}</strike></li>
                    <li>Gia moi: <a><c:set var="newprice" value="${item.price*(1-item.discount)}"/>
                        <fmt:formatNumber value="${newprice}"/></a></li>
                    <li>Muc gia:
                        <c:choose>
                            <c:when test="${newprice < 10}">Giá thấp</c:when>
                            <c:when test="${newprice > 100}">Giá cao</c:when>
                            <c:otherwise><a>Bình thường</a></c:otherwise>
                        </c:choose>
                        <a></a></li>
                </ul>
            </div>
        </div>
        <div class="card-footer">
            Ngày : <fmt:formatDate value="${item.date}" pattern="dd-MM-yyyy"/>
        </div>
    </div>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>