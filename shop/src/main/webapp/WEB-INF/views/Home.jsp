<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<style type="text/css">


.back {
	
	/*background-image: url("resources/images/wood.jpg");*/
	background-repeat: no-repeat;
	background-size: cover;
	background-color:pink
	
}
a1
{
	text-shadow: 2px 2px white;
	font-size: .3n
}
</style>
<body class="back">
	<!-- navigation bar -->
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a1 class="navbar-brand" href="#">Welcome to Bluestone</a1>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="MainHome">Home</a></li>
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
	
	
</body>
</html>