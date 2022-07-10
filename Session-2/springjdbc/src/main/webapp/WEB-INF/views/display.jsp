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
<h1>Product List Page</h1>
<table>

	<tr>
		<th>ID</th><th>Name</th><th>Price</th><th>Date</th>
	</tr>
	<c:forEach var="product" items="${list }">
		<tr>
			<td>${product.id }</td>
			<td>${product.name }</td>
			<td>${product.price }</td>
			<td>${product.dateAdded }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>