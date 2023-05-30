<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>

    <tr>
        <th>STT</th>
        <th>Product Code</th>
        <th>ProductName</th>
        <th>Price</th>
        <th>Category Name</th>
        <th>Category Code</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${listds}" var="ds" varStatus="">
        <tr>
            <td>${stt.index}</td>
            <td>${ds.productCode}</td>
            <td>${ds.productName}</td>
            <td>${ds.price}</td>
            <td>${ds.category.categoryName1}</td>
            <td>${ds.category.categoryCode}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
