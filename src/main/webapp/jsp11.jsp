<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 06.01.19
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    role = <c:out value="${param.role}" default="quest"/> <br>
    test = ${test}
</body>
</html>
