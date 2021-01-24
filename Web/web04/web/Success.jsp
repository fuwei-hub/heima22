<%@ page import="cn.itcast.web.cn.itcase.domain.User" %><%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/10/29
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User userdata = (User) session.getAttribute("userdata");
    String username = userdata.getUsername();
%>
<%= "欢迎" + username + "登录"%>  <br>
<a href="<%=request.getContextPath()%>/FindAllUserServlet">点击查看学生信息</a>
<a href="<%=request.getContextPath()%>/DeleteUserServlet">退出</a>

</body>
</html>
