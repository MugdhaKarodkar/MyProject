<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Being Java Guys | Edit User Details</title>
</head>
<body>
 <center>

  <div style="color: teal; font-size: 30px">Update Category</div>



  <c:url var="userRegistration" value="saveUser.html" />
  <form:form id="registerForm" modelAttribute="category" method="post"
   action="update">
    <table width="400px" height="150px">
    <tr>
     <td><form:label path="id">ID</form:label></td>
     <td><form:input path="id" value="${category.id}" /></td>
    </tr>
    <tr>
     <td><form:label path="name">Name</form:label></td>
     <td><form:input path="name" value="${category.name}"/></td>
    </tr>
    <tr>
     <td><form:label path="description">Description</form:label></td>
     <td><form:input path="description" value="${category.description}"/></td>
    </tr>
    
    <tr>
     <td></td>
     <td><input type="submit" value="Update" />
     </td>
    </tr>
   </table>
  </form:form>


  
 </center>
</body>
</html>