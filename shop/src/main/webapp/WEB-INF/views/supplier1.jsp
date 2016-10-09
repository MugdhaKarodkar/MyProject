<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Supplier</title>
</head>
<style type="text/css">


.back {
	
/* 	background-image: url("resources/images/wood.jpg"); */
	background-repeat: no-repeat;
	background-size: cover;
	background-color:pink
	
}

</style>
<body class="back">
	
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a1 class="navbar-brand" href="#">Welcome to Bluestone</a1>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="MainHome">Home</a></li>
				<li class="active"><a href="Home">Admin Home</a></li>
				<li class="active"><a href="About_us">About us</a></li>
				<li class="active"><a href="Category">Category</a></li>
				<li class="active"><a href="Supplier">Supplier</a></li>
                <li class="active"><a href="Product">Product</a></li>
                
			</ul>
			
			<ul class="nav navbar-nav navbar-right">
				<li><a href="MainHome""><span
						class="active"></span>Logout</a></li>
				
			</ul>
		</div>
	</nav>
	
	
	<!-- Edit supplier -->
	<center>
		<div style="color: teal; font-size: 30px">Update Supplier</div>
		<form:form  modelAttribute="supplier" method="post"
			action="update_supplier" enctype="multipart/form-data">
			<table width="400px" height="150px">
				<tr>
					<td><form:label path="supplier_id">ID</form:label></td>
					<td><form:input path="supplier_id" value="${supplierObject.supplier_id}" readonly="true"/></td>
				</tr>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name" value="${supplierObject.name}" /></td>
				</tr>
				<tr>
					<td><form:label path="address">Address</form:label></td>
					<td><form:input path="address"
							value="${supplierObject.address}" /></td>
				</tr>
				<tr>
					<td align="left"><form:label path="">Select Image</form:label></td>
					<td align="left"><form:input type="file" name="image" path="" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Update" /></td>
				</tr>
			</table>
		</form:form>
	</center>
	<!-- Edit category -->
	
	
	
	<!--Supplier List-->
	<center>

		<div style="color: teal; font-size: 30px">Suppliers</div>
		<c:if test="${!empty supplierList}">
			<table border="1" bgcolor="black" width="600px">
				<tr
					style="background-color: teal; color: white; text-align: center;"
					height="40px">
					<td>ID</td>
					<td>NAME</td>
					<td>ADDRESS</td>
					<td>IMAGE</td>
					<td>EDIT</td>
					<td>DELETE</td>
				</tr>
				<c:forEach items="${supplierList}" var="supplier">
					<tr
						style="background-color: white; color: black; text-align: center;"
						height="30px">
						<td><c:out value="${supplier.supplier_id}" /></td>
						<td><c:out value="${supplier.name}" /></td>
						<td><c:out value="${supplier.address}" /></td>
						<td><img src="${supplier.imagepath}" width="45" height="45" /></td>
						<td><a href="edit_supplier?supplier_id=${supplier.supplier_id}">Edit</a></td>
						<td><a href="delete_supplier?supplier_id=${supplier.supplier_id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

	</center>
	<!--Supplier List-->
</body>
</html>