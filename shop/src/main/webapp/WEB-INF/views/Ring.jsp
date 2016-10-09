<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ring collection</title>
</head>


<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>

<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	margin: auto;
}
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
				
					
					<li><a href="user"><span
						class=""></span>Home</a></li>
			</ul>
			
			<ul class="nav navbar-nav navbar-right">
				
				<li><a href="showcart"><img border="0" src="resources/images/showcart.jpg" width="60" height="60"> &nbsp; &nbsp; </a></li>
				<li><a href="Logout"><span
						class="glyphicon glyphicon-log-in"></span>Logout</a></li>
			</ul>
		</div>
	</nav>
	
	<!-- grid starts-->
<div class="container">
	<div class="row">
		<div class="col-xs-4">
			<a href="Bangle" class="thumbnail"> <img
				src="resources/images/ban.jpg"  />
			</a>
			
		</div>
		<div class="col-xs-4">
			<a href="Ring" class="thumbnail"> <img
				src="resources/images/rin.jpg"/>
			</a>
		</div>
		<div class="col-xs-4">
			<a href="Necklace" class="thumbnail"> <img
				src="resources/images/neck.jpg"/>
			</a>
		</div>
	</div>
</div>
<!-- grid ends-->
	



     <sql:setDataSource
        var="dataSource"
        driver="org.h2.Driver"
        url="jdbc:h2:tcp://localhost/~/NIITDB"
        user="sa" password="sa"
    />
     
    <sql:query var="pr" dataSource="${dataSource}">
        SELECT * FROM product where category_id='02';
    </sql:query>
     
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>Collection of Rings</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Image</th>
            </tr>
            <c:forEach var="product" items="${pr.rows}">
                <tr>
                    <td><c:out value="${product.id}" /></td>
                    <td><c:out value="${product.name}" /></td>
                    <td><c:out value="${product.description}" /></td>
                    <td><c:out value="${product.price}" /></td>
                    <td><img src="${product.imagepath}" height="30" width="30" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>