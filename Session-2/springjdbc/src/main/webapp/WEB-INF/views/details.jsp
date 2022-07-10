<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Product Details</h1>

<h3>${product.name }</h3>
<h2>${product.price }</h2>
<h2>${product.dateAdded}</h2>
<a href="edit?id=${product.id }">Edit Product</a>
</body>
</html>