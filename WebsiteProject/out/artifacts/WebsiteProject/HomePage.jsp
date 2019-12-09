<%@ page import="com.nmcnpm.nhom16.service.BookService" %>
<%@ page import="java.util.List" %>
<%@ page import="com.nmcnpm.nhom16.entities.Book" %>
<%@ page import="com.nmcnpm.nhom16.service.CategoryService" %>
<%@ page import="com.nmcnpm.nhom16.entities.Category" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/23/2019
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<style>
    .quantity-price{
        position: absolute;
        bottom: 40px;
    }

    .quantity{
        width: 30px;
        height: 30px;
        text-align: center;
        background-color: blue;
        color: white;
        font-weight: bold;
        border: none ;
    }

    .price{
        color: #bd0017;
        font-size: 20px;
        padding-left: 80px;
    }

    .btn-inc{
        height: 30px;
        width: 30px;
        background-color: #a4a4a4;
        border-radius: 0 !important;
        text-align: center !important;
        padding: 0 !important;
        font-weight: bold !important;
    }
</style>
<body>
<%@include file="Header.jsp"%>
<div class="container">

    <div class="row" style=" padding-top: 32px">

        <div class="col-lg-3">

            <h1 class="my-4">Shop Name</h1>
            <% CategoryService categoryService  = new CategoryService();
                List<Category> list = categoryService.getAllCategory();
                for (Category category: list
                ) { %>

            <div class="list-group">
                <a href="#" class="list-group-item"><%= category.getNameCategory() %></a>
            </div>

            <% }%>

        </div>
        <!-- /.col-lg-3 -->

        <div class="col-lg-9">

            <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active">
                        <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="http://placehold.it/900x350" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>

            <div class="row">
                <% BookService bookService = new BookService();
                    List<Book> books = bookService.getAllBook();
                    for (Book book: books
                    ) { %>
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card h-100">
                        <a href="#"><img style="padding-top: 5px; padding-left: 1px;" width="100px" height="250px" class="card-img-top" src="<%= book.getImageURL() %>" alt=""></a>
                        <div class="card-body">
                            <h4 class="card-title">
                                <a href="#"><%= book.getNameBook()%></a>
                            </h4>
                            <h5><%= book.getPrice() %></h5>
                            <p class="card-text"><%= book.getDescription() %></p>
                        </div>
                        <div>
                            <div  style="text-align: center; padding-bottom: 20px">
                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                                    Buy now
                                </button>
                            </div>

                            <!-- The Modal -->
                            <div class="modal fade" id="myModal">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content">

                                        <!-- Modal Header -->
                                        <div class="modal-header">
                                            <h4 class="modal-title"><%= book.getNameBook()%></h4>
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        </div>

                                        <!-- Modal body -->
                                        <div class="modal-body">
                                            <div class="row">
                                                <div class="col-lg-4 col-md-12">
                                                    <img src="<%= book.getImageURL() %>">
                                                </div>
                                                <div class="col-lg-8 col-md-12">
                                                    <p>Market price :</p>
                                                    <p>Price : <%= book.getPrice() %></p>
                                                    <p>Saving : </p>
                                                    <p>status :</p>
                                                    <p style="text-align: center">information and promotion</p>
                                                    <p> Sử dụng mỗi 3.000 BBxu để được giảm 10.000đ ( BBxu là gì & cách lấy BBxu )</p>
                                                    <p> Miễn phí vận chuyển nội thành Sài Gòn từ 150.000đ*. Chi tiết tại: Phương thức vận chuyển</p>
                                                    <p> Miễn phí vận chuyển toàn quốc từ 250.000đ</p>
                                                    <div style="height: 20px">
                                                        <div class="row quantity-price">
                                                            <span style=" float: left;font-weight: bold; font-size: 20px">QUANTITY :   </span>
                                                            <div style="float: left;margin-left:5px ">
                                                                <a class="btn btn-inc" onclick="quantity_dec()">-</a>
                                                            </div>
                                                            <div style="float: left;margin-left:5px">
                                                                <input class="quantity" id="quantity" type="text" value="1">
                                                            </div>
                                                            <div style="float: left;margin-left:5px">
                                                                <a class="btn btn-inc" onclick="quantity_inc()">+</a>
                                                            </div>
                                                            <span id="modal-price" class="price" ></span>
                                                            <!--                                </div>-->
                                                        </div>
                                                    </div>

                                                    <div style="padding-top: 10px; text-align: center">
                                                        <button type="button" class="btn btn-primary">ADD TO MY BAG</button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <!-- Modal footer -->
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <% } %>

            </div>
            <!-- /.row -->

        </div>
        <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

</div>
<!-- /.container -->

<!-- Footer -->
<script>
    function quantity_inc() {
        var ele=document.getElementById('quantity');
        ele.value = parseInt(ele.value)+1;
    }

    function quantity_dec() {
        var ele=document.getElementById('quantity');
        if(ele.value != 1)
            ele.value = parseInt(ele.value)-1;
    }
</script>
<%@include file="Footer.jsp"%>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>
