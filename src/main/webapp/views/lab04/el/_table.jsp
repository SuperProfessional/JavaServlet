<%--
  Created by IntelliJ IDEA.
  User: ghoul
  Date: 7/19/22
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h3>User List</h3>
<table class="table table-light">
    <thead class="thead-light">
    <tr>
        <th>Username</th>
        <th>Password</th>
        <th>Remember</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${items}">
        <tr>
            <td>${item.username}</td>
            <td>${item.password}</td>
            <td>${item.remember}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
