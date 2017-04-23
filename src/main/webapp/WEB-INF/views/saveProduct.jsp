<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>saveProduct</title>
</head>
<body>
    <div>
        <form action="saveProduct" method="post" enctype="multipart/form-data">
            <input type="text" name="productName">
            <input type="text" name="description">
            <input type="file" name="foto">
            <select name="category">
                <c:forEach items="${categorys}" var="category">
                    <option value=${category.id}>${category.title}</option>
                </c:forEach>
            </select>
            <input type="submit" value="Додати продукт">
        </form>
    </div>
</body>
</html>
