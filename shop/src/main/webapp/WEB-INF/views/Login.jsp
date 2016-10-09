<!--  <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping Cart</title>
</head>
<style type="text/css">
h2 
{
	text-shadow: 2px 2px red;
	margin: 0 auto;
	letter-spacing: 15px;
	font-size: .2n;
	background-color: black;
	color: white;
	text-transform: uppercase;
	width: 380px
}
span 
{
	color: maroon
}

fieldset 
{
	padding: 30px;
	box-shadow: 10px 10px;
	border-radius: 8px;
	width: 350px;
	font-family: Arial;
	background-color: SandyBrown;
	border: 4px solid Black;
	text-align: left;
	margin: 100px auto
}

label 
{
	color: Maroon;
	display: block;
	position: relative;
	line-height: 1;
	margin: 30px 0px
}

.text 
{
	position: absolute;
	margin-left: 20px;
	width: 15em;
	left: 80px
}

legend 
{
	font-variant: small-caps;
	font-size: 1.5em;
	border-radius: 8px;
	background-color: Maroon;
	border: 2px solid white;
	color: sandybrown
}

.button 
{
	border: 2px solid white;
	background-color: Maroon;
	color: SandyBrown;
	font-size: 17px
}

.back 
{
	background-image: url('resources/images/wood.jpg');
	background-repeat: no-repeat;
	background-size: cover
}
</style>
<body class="back">
	<h2 align="center">Login page</h2>
	<form name="Login Form">
	
		<fieldset>
			<legend>Login Form</legend>
			<label>username: <span>*</span><input class="text" type="text" name="userID"></label> 
			<label>password: <span>*</span><input class="text" type="password" name="password"></label> 
			<input class="button" type="submit" onclick="check (this.form)" class="submitButton">
			 <input class="button" type="reset" class="resetButton">
        </fieldset>
	</form>
	<script>
		function check(form) 
		{

			if (form.userID.value == null || form.userID.value == "") 
			{
				alert("Name must be filled out");
				return false;
			}
			if (form.password.value == null || form.password.value == "") 
			{
				alert("password must be filled out");
				return false;
			}
			if (form.userID.value == "niit" && form.password.value == "niit")
			{
				window.open('Home')
			} else 
			{
				alert("Password or username is incorrect")
			}
		}
	</script>
</body>
</html>-->






<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="resources/css/style.css">
</head>


<!-- navigation bar -->
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">DIAMOND JEWELLARS</a>
			</div>
			<ul class="nav navbar-nav">
				
				<li class="active"><a href="About_us">About Us</a></li>
				<li class="active"><a href="MainHome">Home</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="Signup""><span
						class="glyphicon glyphicon-user"></span>Signup</a></li>
				
			</ul>
		</div>
	</nav>



<body>

	<form action="<c:url value='/j_spring_security_check'/>" method="post">
		<div class="login">
			<div class="login-screen">
				<div class="app-title">
					<h1>Login</h1>
				</div>

				<div class="login-form">
					<div class="control-group">
						<input type="text" class="login-field" value="" name="jusername"
							placeholder="user_id" id="login-name"> <label
							class="login-field-icon fui-user" for="login-name"></label>
					</div>

					<div class="control-group">
						<input type="password" class="login-field" value=""
							name="jpassword" placeholder="password" id="login-pass">
						<label class="login-field-icon fui-lock" for="login-pass"></label>
					</div>
					<!-- <input class="btn btn-primary btn-large btn-block" type="submit"
						onclick="check (this.form)">-->
					<input class="btn btn-primary btn-large btn-block" type="submit">
					<br> <input class="btn btn-primary btn-large btn-block"
						type="reset" value="Cancel"><br>
<!-- 					<button class="btn btn-primary btn-large btn-block" type="button" -->
<!-- 						onclick="window.location.href='Signup'">Register</button> -->

				</div>
			</div>
		</div>

		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>

</body>

</html>
