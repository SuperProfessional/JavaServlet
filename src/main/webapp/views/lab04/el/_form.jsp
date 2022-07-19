<%--
  Created by IntelliJ IDEA.
  User: ghoul
  Date: 7/19/22
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h2>User Edition</h2>

<form action="${pageContext.request.contextPath}/user" method="post">
    <div class="form-group">
        <label >Username:</label>
        <input class="form-control" type="text" name="username" value="${form.username}">
    </div>
    <div class="form-group">
        <label >Password:</label>
        <input class="form-control" type="password" name="password" value="${form.password}">
    </div>
    <div class="form-check">
        <input class="form-check-input" type="checkbox" name="remember" value="${(form.remember)?true:false}">
        <label class="form-check-label">Remember me?</label>
    </div>
    <button type="submit" class="btn btn-primary">Create</button>
</form>
