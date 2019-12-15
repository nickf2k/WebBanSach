<%@ page import="java.util.List" %>
<%@ page import="com.nmcnpm.nhom16.entities.Item" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/23/2019
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src='https://kit.fontawesome.com/a076d05399.js'></script>

</head>
<script>
    function convert_number(num){
        return (num).toFixed(1).replace(/\d(?=(\d{3})+\.)/g, '$&,')+' VNĐ';
    }
</script>
<body>
<%@include file="Header.jsp"%>
<div style="padding-top: 35px" class="container mb-4">
    <div  style="padding-top: 100px" class="row">
        <div>
            <h2>Giỏ hàng của bạn</h2>
        </div>
        <div class="col-12">
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th >Product</th>
                        <th >Available</th>
                        <th class="text-center">Quantity</th>
                        <th class="text-right">Price</th>
                    </tr>
                    </thead>
                    <tbody>
                        <%
                            int total = 0;
                            List<Item> listItems = (List<Item>) session.getAttribute("listItems");
                            for(Item item: listItems){
                                total += Integer.parseInt(item.getBook().getPrice())*item.getQuantity();
                        %>

<%--                        <tr><td><%=item.getBook().getNameBook() %></td>--%>
<%--                            <td><%=item.getQuantity() %></td></tr>--%>
                        <tr>
                            <td><%=item.getBook().getNameBook()%></td>
                            <td><input class="form-control" type="text" value=<%=item.getQuantity() %> /></td>
                            <td class="text-center"><script>document.write(convert_number(<%=Integer.parseInt(item.getBook().getPrice())*item.getQuantity()%>))</script></td>
                            <td class="text-right"><button class="btn btn-sm btn-danger"><i class="fa fa-trash"></i> </button> </td>
                        </tr>

                        <%
                            }
                        %>

                    </tbody>
                </table>
                <h4 style="float: right">Tổng tiền: <script>document.write(convert_number(parseInt(<%=total%>)))</script></h4>
            </div>
        </div>
        <div class="col mb-2">
            <div class="row">
                <div class="col-sm-12  col-md-6">
                    <form method="post" action="<%=request.getContextPath()%>/HomePage.jsp">
                    <button class="btn btn-block btn-light">Tiếp tục mua hàng</button>
                    </form>
                </div>
                <div class="col-sm-12 col-md-6 text-right">
                    <button class="btn btn-lg btn-block btn-primary text-uppercase">Thanh toán</button>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="Footer.jsp"%>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>
