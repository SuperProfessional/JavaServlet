<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">

<head>
    <title>Online Shopping Mall</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
<div class="container-fluid">
    <header class="row">
        <div class="col-sm-9">Online Shopping Mall</div>
        <div class="col-sm-3">
            <div style="padding: 10px">
                <img src="https://upload.wikimedia.org/wikipedia/commons/2/20/FPT_Polytechnic.png" alt="" style="height: 100px">
            </div>
        </div>

    </header>
    <jsp:include page="menu.jsp"/>
    <div >
        <div class="row">
            <article class="col-sm-9">
                <div class="row">
                    <c:forEach var="i" begin="1" end="6">
                        <jsp:include page="item.jsp">
                            <jsp:param name="name" value="Ten san pham ${i}"/>
                            <jsp:param name="image" value="https://cdn.fptshop.com.vn/Uploads/Originals/2021/11/22/637731793300543684_vivo-v23e-xanh-hong-dd.jpg"/>
                        </jsp:include>
                    </c:forEach>
                </div>
            </article>
            <aside class="col-sm-3">
                <div style="margin-top: 10px">
                    <%@include file="login.jsp"%>
                </div>
                <div style="margin-top: 10px;margin-bottom: 10px;">
                    <%@include file="category.jsp"%>
                </div>
            </aside>
        </div>
        </aside>
    </div>
</div>
<footer style="background-color:rgb(78, 80, 82) ;height: 50px; text-align: center; color: white;">
    FPT Polytechnic @2020. ALL rights reserved.
</footer>
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