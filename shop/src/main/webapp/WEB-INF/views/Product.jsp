<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Product</title>
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


	<center>
		<div style="color: teal; font-size: 30px">Add Product</div>

		<form:form modelAttribute="product" method="post" action="saveProduct"
			enctype="multipart/form-data">

			<table width="400px" height="150px">

				<tr>
					<td><form:label path="id">ID</form:label></td>
					<c:choose>
						<c:when test="${!empty productObject.id}">
							<td><form:input path="id" 
									readonly="true" /></td>
						</c:when>
						<c:otherwise>
							<td><form:input path="id" pattern=".{1,8}" required="true"
									title="id should contain 1 to 8 characters" /></td>
						</c:otherwise>
					</c:choose>
				</tr>

				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name" 
							required="true" /></td>
				</tr>

				<tr>
					<td><form:label path="description">Description</form:label></td>
					<td><form:input path="description"
							value="${productObject.description}" required="true" /></td>
				</tr>
				<tr>
					<td><form:label path="price">Price</form:label></td>
					<td><form:input path="price" 
							required="true" /></td>

				</tr>
				<tr>
					<td align="left"><form:label path="">Select Image</form:label></td>
					<td align="left"><form:input type="file" name="image" path="" /></td>
				</tr>
				</tr>

				<tr>
					<td><form:label path="category.category_id">Product Type:</form:label>
					</td>
					<td><form:select path="category.category_id"
							cssStyle="width: 150px;">
							<option value="-1">Select a type</option>
							<c:forEach items="${categoryList}" var="category">
								<option value="${category.category_id}">${category.name}</option>
							</c:forEach>
						</form:select></td>
				</tr>

				<tr>
					<td><form:label path="supplier.supplier_id">Product Supplier:</form:label>
					</td>
					<td><form:select path="supplier.supplier_id"
							cssStyle="width: 150px;">
							<option value="-1">Select a supplier</option>
							<c:forEach items="${supplierList}" var="supplier">
								<option value="${supplier.supplier_id}">${supplier.name}</option>
							</c:forEach>
						</form:select></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Add" /></td>
					<!-- 					<td><input type="reset" value="Reset" /></td> -->
				</tr>
				<td></td>
			</table>
		</form:form>

	</center>
	<!--Product List-->
	<center>

		<div style="color: teal; font-size: 30px">Products</div>
		<c:if test="${!empty productList}">
			<table border="1" bgcolor="black" width="600px">
				<tr
					style="background-color: teal; color: white; text-align: center;"
					height="40px">
					<td>ID</td>
					<td>NAME</td>
					<td>DESCRIPTION</td>
					<td>PRICE</td>
					<td>PRODUCT TYPE</td>
					<td>PRODUCT SUPPLIER</td>
					<td>IMAGE</td>
					<td>EDIT</td>
					<td>DELETE</td>
				</tr>
				<c:forEach items="${productList}" var="product">
					<tr
						style="background-color: white; color: black; text-align: center;"
						height="30px">
						<td><c:out value="${product.id}" /></td>
						<td><c:out value="${product.name}" /></td>
						<td><c:out value="${product.description}" /></td>
						<td><c:out value="${product.price}" /></td>
						<td><c:out value="${product.category.name}" /></td>
						<td><c:out value="${product.supplier.name}" /></td>
						<td><img src="${product.imagepath}" height="30" width="30" /></td>
						<td><a href="edit_product?id=${product.id}">Edit</a></td>
						<td><a href="delete_product?id=${product.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

	</center>
	<!--Category List-->
</body>
</html>