<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/15
  Time: 7:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/inc.jsp"%>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<c:if test="${sessionScope.user eq null}">
    <c:redirect url="${ctx}/index.jsp"/>
</c:if>
    <form action="${ctx}/books/update" method="post">
        <input type="hidden" name="id" value="${sessionScope.booker.id}">
        <input type="text" name="bookname" value="${sessionScope.booker.bookname}">
        <input type="text" name="writer" value="${sessionScope.booker.writer}">
        <input type="submit" value="SAVE">
    </form>
<br>
<a href="${ctx}/users/logout">Log out</a>
</body>
</html>
