<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/11/9
  Time: 20:40
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
<table class="table table-striped table-responsive table-bordered table-condensed">
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>工资</td>
        <td>部门编号</td>
    </tr>
    <c:forEach items="${emp}" var="employee" varStatus="id">
        <tr>
            <td>${id.count}</td>
            <td>${employee.emp_name}</td>
            <td>${employee.dept_id}</td>
            <td>${employee.emp_wage}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
