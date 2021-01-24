<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/11/13
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/PersonServlet/update">
          <input type="hidden" name="id" value="${user.id}"><br>
    姓名： <input type="text" name="name" value="${user.name}"><br>
    年龄： <input type="text" name="age" value="${user.age}"><br>
   <button>提交修改</button>
</form>
</body>
</html>
