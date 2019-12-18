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
<div class="container">
    <%@include file="Header.jsp"%>
    <h2 style="padding-top: 60px">Thanh toán</h2>
    <form method="post" action="<%= request.getContextPath() %>/totalpay">
        <div class="form-group">
            <label>Nhập số điện thoại</label>
            <input type="number" class="form-control" name="phone" placeholder="nhập số điện thoại">
        </div>
        <div class="form-group">
            <label>Địa chỉ giao hàng</label>
            <input  class="form-control" name="Address" placeholder="Địa chỉ của bạn">
        </div>

        <div class="form-group">
            <label>Phương thức thanh toán</label>
            <select class="form-control" name="paymentMethods">
                <option value="cash">Tiền mặt</option>
                <option value="notCash">Không phải tiền mặt</option>
            </select>
        </div>
        <div class="form-group">
            <label>Tổng số tiền phải thanh toán</label>
            <input  class="form-control" name="totalMoney" value="">
        </div>
        <button type="submit" class="btn btn-primary">Thanh toán</button>
    </form>
</div>
<%@include file="Footer.jsp"%>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>
