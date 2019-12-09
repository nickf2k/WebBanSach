<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/23/2019
  Time: 11:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="#">Start Bootstrap</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="HomePage.jsp">Trang Chủ
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="Cart.jsp">Giỏ Hàng</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="#">Khuyến Mãi</a>
                </li>
                <% if (session.getAttribute("user") == null){%>
                <li class="nav-item active" >
                    <a class="nav-link" href="Register.jsp">Đăng kí</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="Login.jsp">Đăng Nhập</a>
                </li>
                <% }else {%>
                <li class="nav-item active">
                    <a class="nav-link" href="">${sessionScope.user}</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="<%=request.getContextPath()%>/logout.jsp">Đăng xuất</a>
                </li>

                <% } %>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
