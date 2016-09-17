<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Category</title>
</head>
<body>
	<center>

		<div style="color: teal; font-size: 30px">Add Category</div>

		<form:form enctype="multipart/form-data" modelAttribute="category" method="post" action="saveCategory">

			<table width="400px" height="150px">

				<tr>
					<td><form:label path="id">ID</form:label></td>
				    <c:choose>
						<c:when test="${!empty categoryObject.id}">
							<td><form:input path="id" value="${categoryObject.id}"  readonly="true" /></td>
						</c:when>
						<c:otherwise>
							<td><form:input path="id" pattern=".{1,8}"  required="true" title="id should contain 1 to 8 characters"/></td>
						</c:otherwise>
					</c:choose>	
				</tr>

				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name" value="${categoryObject.name}" required="true"/></td>
				</tr>

				<tr>
					<td><form:label path="description">Description</form:label></td>
					<td><form:input path="description" value="${categoryObject.description}" required="true" /></td>
				</tr>

				<tr>
					<td><form:label path="image"></form:label></td>
					<td><form:input type="file" name="image" path="image" /></td>
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
	<!--Category List-->
	<center>

		<div style="color: teal; font-size: 30px">Categories</div>
		<c:if test="${!empty categoryList}">
			<table border="1" bgcolor="black" width="600px">
				<tr
					style="background-color: teal; color: white; text-align: center;"height="40px">
					<td>id</td>
					<td>name</td>
					<td>description</td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>
				<c:forEach items="${categoryList}" var="category">
					<tr
						style="background-color: white; color: black; text-align: center;"
						height="30px">
						<td><c:out value="${category.id}" /></td>
						<td><c:out value="${category.name}" /></td>
						<td><c:out value="${category.description}" /></td>
						<td><a href="edit_category?id=${category.id}">Edit</a></td>
						<td><a href="delete_category?id=${category.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

	</center>
	<!--Category List-->

	<!-- Edit category -->
	<!--<center>
		<div style="color: teal; font-size: 30px">Update Category</div>
		<c:url var="userRegistration" value="saveUser.html" />
		<form:form id="registerForm" modelAttribute="category" method="post"
			action="update">
			<table width="400px" height="150px">
				<tr>
					<td><form:label path="id">ID</form:label></td>
					<td><form:input path="id" value="${categoryObject.id}" /></td>
				</tr>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name" value="${categoryObject.name}" /></td>
				</tr>
				<tr>
					<td><form:label path="description">Description</form:label></td>
					<td><form:input path="description"
							value="${categoryObject.description}" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Update" /></td>
				</tr>
			</table>
		</form:form>
	</center>-->
	<!-- Edit category -->
</body>
</html>