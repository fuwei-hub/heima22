<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/10/30
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎${userInfo.username} </h1>
<h1><a href="${pageContext.request.contextPath}/DeletServlet">退出</a></h1>
<a href="${pageContext.request.contextPath}/ListServlet">查看学生信息</a>
</body>
</html>
