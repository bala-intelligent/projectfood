<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Foodproduct management</title>
</head>
<body>
	<h1>Foodproducts data</h1>
	<form:form action="viewall.do" method="POST" commandName="foodproducts">
		<table>
		 <tr>
		 <td>productId</td>
		 <td><form:input path="productId" id="productId" readonly=""/></td>
		 </tr>
		 <tr>
		 <td>vegetarian</td>
		 <td><form:input path="vegetarian"/></td>
		 </tr>
		 <tr>
		 <td>nonvegetarian</td>
		 <td><form:input path="nonvegetarian"/></td>
		 </tr>
		 <tr>
		 <td>snacks</td>
		 <td><form:input path="snacks"/></td>
		 </tr>
		 <tr>
		 <td>beverages</td>
		 <td><form:input path="beverages"/></td>
		 </tr>
		 <tr>
		   <td colspan="2">
		    <input type="submit" name="action" value="Add" onclick="clickevent()"/>
		    <input type="submit" name="action" value="Edit" />
		    <input type="submit" name="action" value="Delete"/>
		   <input type="submit" name="action" value="View All"/>
		   </td>
		 </tr>
		</table>
	</form:form>
	<br>
	<script>
	function clickevent()
	{
		document.getElementById("productId").readOnly = true;
	}
	</script>
	<!-- table contents -->
</body>
</html>