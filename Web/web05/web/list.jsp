<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/10/30
  Time: 19:11
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
<table class="table table-striped table-hover table-bordered" >
    <tr class="success">
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>住址</td>
    </tr>
    <c:if test="${not empty users}" >
        <c:forEach items="${users}" var="stu" varStatus="id">
            <tr>
                <td>${id.count}</td>
                <td>${stu.name}</td>
                <td>${stu.age}</td>
                <td>${stu.address}</td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>
</html>
