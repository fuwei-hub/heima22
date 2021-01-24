<%@ page import="java.util.ArrayList" %>
<%@ page import="cn.itcast.cn.itcase.domain.Employee" %><%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/10/30
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<%
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("小王", "23","shanxi"));
    students.add(new Student("小红", "25","shanxi"));
    students.add(new Student("小绿", "28","shanxi"));
    students.add(new Student("小紫", "29","shanxi"));
    pageContext.setAttribute("StudentData", students);
%>

<table>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <c:forEach items="${StudentData}" var="stu" varStatus="ID">
        <c:if test="${ID.index%2==0}">
                <tr style="background-color: darkorange">
                    <td>${ID.count}</td>
                    <td>${stu.name}</td>
                    <td>${stu.age}</td>
                </tr>
        </c:if>
        <c:if test="${ID.index%2!=0}">
            <tr style="background-color: cornflowerblue">
                <td>${ID.count}</td>
                <td>${stu.name}</td>
                <td>${stu.age}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>
