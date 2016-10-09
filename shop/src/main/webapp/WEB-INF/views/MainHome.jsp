<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	margin: auto;
}
.back {
	background-image: url("resources/images/wood.jpg");
	background-repeat: no-repeat;
	background-size: cover
}
</style>
</head>
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
				
				<li class="active"><a href="About_us">About Us</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="Signup""><span
						class="glyphicon glyphicon-user"></span>Signup</a></li>
				<li><a href="Login"><span
						class="glyphicon glyphicon-log-in"></span>Login</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<br>
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
				<li data-target="#myCarousel" data-slide-to="4"></li>
			</ol>
			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="resources/images/slider1.jpg">
					<div class="carousel-caption">
						<h3>Platinum</h3>
						<p>Reflect yourself</p>
					</div>
				</div>
				<div class="item">
					<img src="resources/images/slider2.jpg">
					<div class="carousel-caption">
						<h3>Diamond</h3>
						<p>For a beautiful and blissful marital life</p>
					</div>
				</div>
				<div class="item">
					<img src="resources/images/slider3.jpg" >
					<div class="carousel-caption">
						<h3>Pearl</h3>
						<p>For both inner and outer beauty</p>
					</div>
				</div>
				<div class="item">
					<img src="resources/images/slider4.jpg">
					<div class="carousel-caption">
						<h3>Platinum</h3>
						<p>Reflect yourself</p>
					</div>
				</div>
				<div class="item">
					<img src="resources/images/slider4.jpg">
					<div class="carousel-caption">
						<h3>Gold</h3>
						<p>To have a golden life</p>
					</div>
				</div>
			</div>
			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>
</body>
<!-- grid starts-->
<div class="container">
	<div class="row">
		<div class="col-xs-4">
			<a href="Bangle1" class="thumbnail"> <img
				src="resources/images/ban.jpg"  />
			</a>
		</div>
		<div class="col-xs-4">
			<a href="Ring1" class="thumbnail"> <img
				src="resources/images/rin.jpg"/>
			</a>
		</div>
		<div class="col-xs-4">
			<a href="Necklace1" class="thumbnail"> <img
				src="resources/images/neck.jpg"/>
			</a>
		</div>
	</div>
</div>
<!-- grid ends-->
</html>

