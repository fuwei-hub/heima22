<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/11/11
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/UserController/login">
    用户名：<input type="text" name="username" ><br>
    密  码：<input type="password" name="password" ><br>
    <button type="submit">提交</button>
</form>
${error}
</body>
</html>
