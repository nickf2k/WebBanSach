<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/13/2019
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Hello JSP</h1>
  <% java.util.Date date = new java.util.Date();%>
  <h2>Now is <%= date.toString()%></h2>
  </body>
</html>
