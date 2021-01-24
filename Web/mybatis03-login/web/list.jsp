<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/11/12
  Time: 19:23
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
<table class="table table-striped table-responsive table-bordered table-condensed ">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${person}" var="person" varStatus="id">
        <c:if test="${id.count==1}">
            <a href="${pageContext.request.contextPath}/add.jsp">添加学生</a>
        </c:if>
        <td>${id.count}</td>
        <td>${person.name}</td>
        <td>${person.age}</td>
        <form action=""></form>
        <td>
            <a href="javascript:void(0)" onclick="del(${person.id})">
                    <%-- ${pageContext.request.contextPath}/PersonServlet/delete?id=${person.id}--%>
                delete</a>
            <a href="${pageContext.request.contextPath}/PersonServlet/findById?id=${person.id}">
                update</a>
        </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
<script>
    function del(person) {
        let flag = confirm("宁真的要删除吗？")
        if (flag) {
            location.href = "${pageContext.request.contextPath}/PersonServlet/delete?id=" + person;
        }
    }
</script>
