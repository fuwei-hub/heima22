<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/11/12
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/PersonServlet/add">
    姓名： <input type="text" name="username"><br>
    年龄： <input type="text" name="age"><br>
    <button>确认添加</button>
</form>
</body>
</html>
