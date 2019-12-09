<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12/8/2019
  Time: 11:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/23/2019
  Time: 11:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.invalidate();
    response.sendRedirect("HomePage.jsp");
%>
</body>
</html>

