<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02.04.17
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>saveCategory</title>
</head>
<body>
    <sf:form modelAttribute="category" action="saveCategory" method="post">
        <sf:input path="title"/>
        <sf:input path="description"/>
        <input type="submit" value="Додати категорію">
    </sf:form>
</body>
</html>
