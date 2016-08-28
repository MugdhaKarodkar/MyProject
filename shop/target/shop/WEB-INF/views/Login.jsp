<!DOCTYPE html>
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
			<input class="button" type="submit" onclick="check (this.form)" class="submitButton"> <input class="button" type="reset" class="resetButton">
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
</html>

