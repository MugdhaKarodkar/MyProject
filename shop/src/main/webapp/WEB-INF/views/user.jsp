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
	/*background-image: url("resources/images/wood.jpg");*/
	background-repeat: no-repeat;
	background-size: cover;
	background-color:pink
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
				
				<li class="active"><a href="About_us">About Us</a></li>
					
					<li><a href="MainHome"><span
						class=""></span>Home</a></li>
			</ul>
			
			<ul class="nav navbar-nav navbar-right">
				
				<li><a href="showcart"><img border="0" src="resources/images/showcart.jpg" width="60" height="60"> &nbsp; &nbsp; </a></li>
				<li><a href="Logout"><span
						class="glyphicon glyphicon-log-in"></span>Logout</a></li>
			</ul>
		</div>
	</nav>
	</body>
	
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


</html>

