<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/7
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/inc.jsp"%>
<html>
<head>
    <title>Home Page</title>
    <script>
        function rem() {
            return confirm("REMOVE?")
        }

    </script>
</head>
<body>
<h1>BOOK LIST</h1>
<form action="${ctx}/books/add" method="post">
    <input type="text" name="bookname" placeholder="BOOKNAME">
    <input type="text" name="writer" placeholder="WRITER">
    <input type="submit" value="ADD">
</form>
<hr>
<table border="1">
    <c:choose>
        <c:when test="${sessionScope.book[0] eq null}">
            <h1>No Record.</h1>
        </c:when>
        <c:otherwise>
        <tr>
            <th>NO</th>
            <th>BOOKNAME</th>
            <th>WRITER</th>
            <th colspan="2">OPTIONS</th>
        </tr>
            <c:forEach var="book" items="${sessionScope.book}" varStatus="vs">
                <tr>
                    <td>${vs.count}</td>
                    <td>${book.bookname}</td>
                    <td>${book.writer}</td>
                    <td><a href="${ctx}/books/search/${book.id}">MODIFY</a></td>
                    <td><a href="${ctx}/books/remove/${book.id}" onclick="rem()">REMOVE</a></td>
                </tr>
            </c:forEach>

        </c:otherwise>

    </c:choose>
</table>
<a href="${ctx}/users/logout">Logout</a>
</body>
</html>
