<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category</title>
    <link rel="stylesheet" href="style/style.css">
</head>
<body>
<c:forEach items="${categories}" var="category">
    <div class="allCategory">
        <h1><a href="#">${category.title}</a></h1>
        <h3>${category.description}</h3>
    </div>
</c:forEach>

</body>
</html>
