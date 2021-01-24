<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/11/3
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
</head>
<body>
<table class=" table table-condensed tab-content table-bordered table-responsive table-striped">
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>住址</td>
    </tr>

    <c:forEach items="${stus}" var="student" varStatus="id">
        <tr>
            <td>${id.count}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
