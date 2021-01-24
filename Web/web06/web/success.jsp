<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/10/30
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎${userInfo.username}登录</h1>
<a href="${pageContext.request.contextPath}/ListServlet">查看学生信息</a>
<a href="${pageContext.request.contextPath}/DeleteServlet">退出</a>
</body>
</html>
