<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/6
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/inc.jsp"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${ctx}/users/login" method="post">
    <input type="text" name="username" placeholder="USERNAME"><br>
    <input type="text" name="password" placeholder="PASSWORD"><br>
    <input type="submit" value="Login">
  </form>
  ${requestScope.message}
  <a href="${ctx}/signin.jsp">Sign in</a>
  <h1>...</h1>
  </body>
</html>
