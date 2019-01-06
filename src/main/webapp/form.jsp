<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 06.01.19
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post">
    <c:forEach begin= "1" end="5" var="value">
    <label>Title${value}:<input type="text" name="title${value}">
    </label>
    <label>Author${value}:<input type="text" name="author${value}">
    </label>
    <label>ISBN${value}:<input type="text" name="isbn${value}">
    </label><br><br>
    </c:forEach>

    <input type="submit" value="Save">

</form>
</body>
</html>
