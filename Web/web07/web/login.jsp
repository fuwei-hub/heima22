<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/11/3
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/LoginServlet">
    账号: <input type="text" name="username" placeholder="请输入账号"><br>
    密码: <input type="password" name="password" placeholder="请输入密码"><br>
    <button type="submit">提交</button>
    ${error}
</form>
</body>
</html>
