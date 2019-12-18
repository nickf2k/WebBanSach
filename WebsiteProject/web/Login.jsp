<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/23/2019
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Shop</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<%@include file="Header.jsp"%>
<div class="container">

    <h1 style="padding-top: 60px">Đăng nhập</h1>
    <%
        String err = request.getParameter("err");
        if ("1".equals(err)) {
            out.print("<h4 style=\"color: red;\">Đăng nhập thất bại</h4>");
        }
    %>
    <form style="padding-bottom: 20px" method="post" action="<%=request.getContextPath()%>/login">
        <div class="form-group">
            <label>Tên đăng nhập</label>
            <input name="user" class="form-control" placeholder="nhập tên đăng nhập">
        </div>
        <div class="form-group">
            <label>Mật khẩu</label>
            <input name="password" type="password" class="form-control"  placeholder="nhập mật khẩu">
        </div>
        <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" id="exampleCheck1">
            <label class="form-check-label" for="exampleCheck1">Nhớ mật khẩu</label>
        </div>
        <button type="submit" class="btn btn-primary">Đăng nhập</button>
    </form>
</div>
<%@include file="Footer.jsp"%>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>
