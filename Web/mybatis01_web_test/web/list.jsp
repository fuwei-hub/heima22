<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/11/10
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
</head>
<body>
<table class="table table-condensed table-bordered table-responsive table-striped">
    <tr>
        <td>类型</td>
        <td>租金</td>
        <td>区域</td>
        <td>代理费用</td>
    </tr>
    <c:forEach items="${list}" var="rent" varStatus="id">
        <tr>
            <td>${id.count}</td>
            <td>${rent.type}</td>
            <td>${rent.rent}</td>
            <td>${rent.area}</td>
            <td>${rent.agencyprice}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
