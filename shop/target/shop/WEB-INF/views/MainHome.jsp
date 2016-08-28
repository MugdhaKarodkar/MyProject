<!DOCTYPE html>
<html lang="en">

<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--  <link href="my-style.css" rel="stylesheet" media="screen">-->
<link rel="stylesheet"  href="resources/css/bootstrap.min.css">
<script
	src="resources/js/jquery.min.js"></script>
<script
	src="resources/js/bootstrap.min.js"></script>
<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img
{
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
				<li class="active"><a href="#">Home</a></li>
				<li class="active"><a href="#">Contact</a></li>
				<li class="active"><a href="#">About Us</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Women <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Platinum</a></li>
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
			<ul class="nav navbar-nav navbar-right">
				<li><a href="Signup""><span
						class="glyphicon glyphicon-user"></span> Signup</a></li>
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
					<img src="resources/images/jewel15.jpg" alt="http://www.google.com">
					<div class="carousel-caption">
						<h3>Platinum</h3>
						<p>Reflect yourself</p>
					</div>
				</div>

				<div class="item">
					<img src="resources/images/jewel17.jpg" alt="http://www.google.com">
					<div class="carousel-caption">
						<h3>Diamond</h3>
						<p>For a beautiful and blissful marital life</p>
					</div>
				</div>
				<div class="item">
					<img src="resources/images/jewel18.jpg" alt="http://www.google.com">
					<div class="carousel-caption">
						<h3>Pearl</h3>
						<p>For both inner and outer beauty</p>
					</div>
				</div>
				<div class="item">
					<img src="resources/images/im.jpg" alt="http://www.google.com">
					<div class="carousel-caption">
						<h3>Platinum</h3>
						<p>Reflect yourself</p>
					</div>
				</div>


				<div class="item">
					<img src="resources/images/jewel19.jpg" alt="Flower" width="460" height="220">
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
</html>

