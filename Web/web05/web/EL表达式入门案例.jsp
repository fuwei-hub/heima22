<%--
  Created by IntelliJ IDEA.
  User: MECHREVO
  Date: 2020/10/30
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
      pageContext.setAttribute("username","tom");
      request.setAttribute("username","jack");
      session.setAttribute("age","18");
      application.setAttribute("address","新加坡");
   %>
${username}
${age}
${address}
${requestScope.username}
<%--${sessionScope.age}--%>
<%--${作用域名加Scope.键的值}--%>
</body>
</html>
