<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bangle collection</title>
</head>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<style>

.back {
	
/* 	background-image: url("resources/images/wood.jpg"); */
	background-repeat: no-repeat;
	background-size: cover;
	background-color:pink
	
}
</style>
<body class="back">

<!-- navigation bar -->
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">DIAMOND JEWELLARS</a>
			</div>
			<ul class="nav navbar-nav">
				<!-- <li class="active"><a href="CategoryList">Categories</a></li>-->
				<!-- <li class="active"><a href="#">Products</a></li>-->
				<li class="active"><a href="#">Contact</a></li>
				<li class="active"><a href="#">About Us</a></li>
				<li class="active"><a href="user">Home</a></li>
            </ul>
			<ul class="nav navbar-nav navbar-right">
				
				<li><a href="showcart"><img border="0" src="resources/images/showcart.jpg" width="60" height="60"> &nbsp; &nbsp; </a></li>
				<li><a href="Logout"><span
						class="glyphicon glyphicon-log-in"></span>Logout</a></li>
			</ul>
		</div>
	</nav>
	


	<sql:setDataSource var="dataSource" driver="org.h2.Driver"
		url="jdbc:h2:tcp://localhost/~/NIITDB" user="sa" password="sa" />

	<sql:query var="pr" dataSource="${dataSource}">
        SELECT * FROM product where category_id='01' AND id='PB3';
    </sql:query>
    
<form>
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2 align="center">Cart</h2>
			</caption>
			<tr>
				<th>PRODUCT ID</th>
				<th>PRODUCT NAME</th>
				<th>PRICE</th>
				<th>IMAGE</th>
				<th>PAYMENT</th>
			</tr>
			<c:forEach var="product" items="${pr.rows}">
				<tr>
					<td><c:out value="${product.id}" /></td>
					<td><c:out value="${product.name}" /></td>
					<td><c:out value="${product.price}" /></td>
					<td><img src="${product.imagepath}" height="30" width="30" /></td>
 				<td><a href="${flowExecutionUrl}&_eventId_submit">Make Payment</a></td> 
 				
					
				</tr>
			</c:forEach>
		</table>
	</div>
	</form>
</body>
</html>