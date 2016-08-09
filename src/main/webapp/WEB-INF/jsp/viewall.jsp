<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view all page</title>
</head>
<body>

<h2 align="center">Product details</h2>
<table border="1" width="50%">
	 <th>productId</th>
	 <th>vegetarian</th>
	 <th>nonvegetarian</th>
	 <th>snacks</th>
	 <th>beverages</th>
	 <c:forEach items="${foodproductsList }" var="foodproducts">
	 <tr>
	  <td>${foodproducts.productId}</td>
	  <td>${foodproducts.vegetarian}</td>
	  <td>${foodproducts.nonvegetarian}</td>
	  <td>${foodproducts.snacks}</td>
	  <td>${foodproducts.beverages}</td>
	  <td>EDIT</td>
	  <td>DELETE</td>
	 </tr>
	 </c:forEach>
	</table>
	<br>
	<input type="button" value="Back" onclick="javascript:history.back()"/>
</body>
</html>