<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/10/29
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/LoginServlet">
    用户名：<input type="text" name="username" placeholder="请输入用户名"><br>
    密 码：<input type="password" name="password" placeholder="请输入密码"><br>
    <button type="submit">提交</button>
    <br>
    <%=request.getAttribute("cuowu")==null?" " :request.getAttribute("cuowu")%>
</form>
</body>
</html>
