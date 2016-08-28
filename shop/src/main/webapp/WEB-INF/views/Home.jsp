<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--<link href="my-style.css" rel="stylesheet" media="screen">-->
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<style type="text/css">
.nav 
{
	background-color: tranparent
}
.back 
{
	background-image: url('resources/images/download.jpg');
	background-repeat: no-repeat;
	background-size: cover
}
a1
{
	text-shadow: 2px 2px white;
	font-size: .3n
}
</style>
<body class="back">
	<!-- navigation bar -->
	<nav class="navbar navbar-inverse,nav">
		<div class="container-fluid">
			<div class="navbar-header">
				<a1 class="navbar-brand" href="#">Welcome to Bluestone</a1>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li class="active"><a href="#">Contact</a></li>
				<li class="active"><a href="Category">Category</a></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Women <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<!--  <li ><a href="#">Platinum</a></li>-->
						<li><a href="gallery">Platinum</a></li>
						<li><a href="#">Gold</a></li>
						<li><a href="#">Diamond</a></li>
						<li><a href="#">Silver</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Men <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Platinum</a></li>
						<li><a href="#">Gold</a></li>
						<li><a href="#">Diamond</a></li>
						<li><a href="#">Silver</a></li>
					</ul></li>
			</ul>
			<ul class="nav navbar-nav">
				<li><a href="MainHome"><span
						class="glyphicon glyphicon-user"></span>Log out</a></li>
			</ul>
		</div>
	</nav>
</body>
</html>