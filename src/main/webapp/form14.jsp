<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 06.01.19
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Przekazana ksiazka: <br>
<table>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.title}, ${book.author}, ${book.isbn}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
