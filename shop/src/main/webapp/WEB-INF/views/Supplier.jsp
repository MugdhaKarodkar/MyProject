<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Supplier</title>
</head>
<body>
	<center>

		<div style="color: teal; font-size: 30px">Add Supplier</div>

		<form:form modelAttribute="supplier" method="post" action="saveSupplier">

			<table width="400px" height="150px">

				<tr>
					<td><form:label path="id">ID</form:label></td>
					<c:choose>
						<c:when test="${!empty supplierObject.id}">
							<td><form:input path="id" value="${supplierObject.id}"  readonly="true" /></td>
						</c:when>
						<c:otherwise>
							<td><form:input path="id" pattern=".{1,8}"  required="true" title="id should contain 1 to 8 characters"/></td>
						</c:otherwise>
					</c:choose>

				</tr>

				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name" value="${supplierObject.name}" required="true"/></td>
				</tr>

				<tr>
					<td><form:label path="address">Address</form:label></td>
					<td><form:input path="address" value="${supplierObject.address}" required="true"/></td>
				</tr>


				<tr>
					<td></td>
					<td><input type="submit" value="Add" /></td>
					<td><input type="reset" value="Reset" /></td>
				</tr>
				<td></td>
			</table>
		</form:form>

	</center>
	<!--Supplier List-->
	<center>

		<div style="color: teal; font-size: 30px">Suppliers</div>
		<c:if test="${!empty supplierList}">
			<table border="1" bgcolor="black" width="600px">
				<tr
					style="background-color: teal; color: white; text-align: center;"
					height="40px">
					<td>id</td>
					<td>name</td>
					<td>address</td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>
				<c:forEach items="${supplierList}" var="supplier">
					<tr
						style="background-color: white; color: black; text-align: center;"
						height="30px">
						<td><c:out value="${supplier.id}" /></td>
						<td><c:out value="${supplier.name}" /></td>
						<td><c:out value="${supplier.address}" /></td>
						<td><a href="edit_supplier?id=${supplier.id}">Edit</a></td>
						<td><a href="delete_supplier?id=${supplier.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

	</center>
	<!--Supplier List-->
</body>
</html>