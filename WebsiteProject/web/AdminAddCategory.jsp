<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/17/2019
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.nmcnpm.nhom16.service.CategoryService" %>
<%@ page import="java.util.List" %>
<%@ page import="com.nmcnpm.nhom16.entities.Category" %>
<%@ page import="com.nmcnpm.nhom16.service.BookService" %>
<%@ page import="com.nmcnpm.nhom16.entities.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin - Dashboard</title>

    <!-- Custom fonts for this template-->
    <link href="assest/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Page level plugin CSS-->
    <link href="assest/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="assest/css/sb-admin.css" rel="stylesheet">

</head>
<script>
    function convert_number(num){
        return (num).toFixed(1).replace(/\d(?=(\d{3})+\.)/g, '$&,')+' VNĐ';
    }
</script>

<body id="page-top">

<nav class="navbar navbar-expand navbar-dark bg-dark static-top">

    <a class="navbar-brand mr-1" href="index.html">Book Shop Admin</a>

    <button class="btn btn-link btn-sm text-white order-1 order-sm-0" id="sidebarToggle" href="#">
        <i class="fas fa-bars"></i>
    </button>

    <!-- Navbar Search -->
    <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
            <div class="input-group-append">
                <button class="btn btn-primary" type="button">
                    <i class="fas fa-search"></i>
                </button>
            </div>
        </div>
    </form>

</nav>

<div id="wrapper">

    <!-- Sidebar -->
    <ul class="sidebar navbar-nav">
        <li class="nav-item active">
            <a class="nav-link" href="<%= request.getContextPath() %>/AdminHomePage.jsp">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Dashboard</span>
            </a>
        </li>
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-fw fa-folder"></i>
                <span>Pages</span>
            </a>
            <div class="dropdown-menu" aria-labelledby="pagesDropdown">
                <h6 class="dropdown-header">Chức năng</h6>
                <a class="dropdown-item" href="<%= request.getContextPath() %>/AdminAddCategory.jsp">Thêm mới thể loại</a>
                <a class="dropdown-item" href="<%= request.getContextPath() %>/AdminListCategory.jsp">Danh sách thể loại</a>
                <a class="dropdown-item" href="<%= request.getContextPath() %>/AdminListBook.jsp">Danh sách sách</a>
                <a class="dropdown-item" href="<%= request.getContextPath() %>/AdminAddBook.jsp"Thêm mới sách</a>
                <div class="dropdown-divider"></div>
            </div>
        </li>
    </ul>

    <div id="content-wrapper">

        <div class="container-fluid">
            <h2>Thêm mới danh mục</h2>
            <form method="post" action="<%= request.getContextPath() %>/AdminListCategory.jsp">
                <div class="form-group">
                    <label>Tên danh mục</label>
                    <input class="form-control" name="NameCategory" placeholder="nhập tên danh mục" >
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Thêm mới</button>
                </div>
            </form>
        </div>
        <!-- /.container-fluid -->

        <!-- Sticky Footer -->
        <footer class="sticky-footer">
            <div class="container my-auto">
                <div class="copyright text-center my-auto">
                    <span>Copyright © Your Website 2019</span>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.content-wrapper -->

</div>
<!-- /#wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<!-- Logout Modal-->
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                <a class="btn btn-primary" href="login.html">Logout</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script src="assest/vendor/jquery/jquery.min.js"></script>
<script src="assest/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="assest/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Page level plugin JavaScript-->
<script src="assest/vendor/chart.js/Chart.min.js"></script>
<script src="assest/vendor/datatables/jquery.dataTables.js"></script>
<script src="assest/vendor/datatables/dataTables.bootstrap4.js"></script>

<!-- Custom scripts for all pages-->
<script src="assest/js/sb-admin.min.js"></script>

<!-- Demo scripts for this page-->
<script src="assest/js/demo/datatables-demo.js"></script>
<script src="assest/js/demo/chart-area-demo.js"></script>

</body>

</html>




