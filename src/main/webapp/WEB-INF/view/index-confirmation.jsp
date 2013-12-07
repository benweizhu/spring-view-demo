<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Spring MVC View Demo</title>
</head>
<body>
<div>${name}</div>
<div>${gender}</div>
<div>
    <c:forEach items="${channels}" var="channel">
        <span>${channel}</span>
    </c:forEach>
</div>
<div>${server}</div>
<div>${agree}</div>
</body>
</html>