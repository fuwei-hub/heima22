<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/11/13
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/LoginController/userLogin">
    账号：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    <button type="submit">登录</button>
</form>
${error}
</body>
</html>
