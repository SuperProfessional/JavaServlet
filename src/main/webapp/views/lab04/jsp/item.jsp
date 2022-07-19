<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="utf-8" %>
<div class="col-sm-4" style="margin-top: 10px;">
    <div class="card">
        <div class="card-body">
                <img src="${param.image}" alt="" style="height: 270px">
        </div>
        <div class="card-footer">
            <a>${param.name}</a>
        </div>
    </div>
</div>