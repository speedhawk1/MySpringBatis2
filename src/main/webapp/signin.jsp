<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/7
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/inc.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${ctx}/users/create" method="post">
        <input type="text" name="username"><br>
        <input type="text" name="password"><br>
        <input type="submit" value="signin">
    </form>
</body>
</html>
