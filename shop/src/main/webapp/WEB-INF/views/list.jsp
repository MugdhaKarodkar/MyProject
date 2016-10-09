<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Categories</title>
</head>
<body>
 <center>
   <div style="color: teal; font-size: 30px">Categories</div>
   <c:if test="${!empty categoryList}">
   <table border="1" bgcolor="black" width="600px">
    <tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
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
      <td><a href="edit?id=${category.id}">Edit</a></td>
      <td><a href="delete?id=${category.id}">Delete</a></td>
     </tr>
    </c:forEach>
   </table>
  </c:if>
  <a href="Category">Click Here to add new User</a>
 </center>
</body>
</html>