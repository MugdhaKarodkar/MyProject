<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping Cart</title>
</head>
<style type="text/css">
h2 {
	text-shadow: 2px 2px red;
	margin: 0 auto;
	letter-spacing: 15px;
	font-size: .2n;
	background-color: black;
	color: white;
	text-transform: uppercase;
	width: 380px
}

span {
	color: maroon
}

fieldset {
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

.text {
	position: absolute;
	margin-left: 70px;
	width: 15em;
	left: 80px
}

legend {
	font-variant: small-caps;
	font-size: 1.5em;
	border-radius: 8px;
	background-color: Maroon;
	border: 2px solid white;
	color: sandybrown
}

.button {
	border: 2px solid white;
	background-color: maroon;
	color: sandyBrown;
	font-size: 16px
}

.email {
	position: absolute;
	margin-left: 70px;
	width: 15em;
	left: 80px
}

label {
	display: block;
	color: Maroon;
	display: block;
	position: relative;
	line-height: 1;
	margin: 30px 10px
}

.back {
	background-image: url('resources/images/wood.jpg');
	background-repeat: no-repeat;
	background-size: cover
}
</style>

<body class="back">
	<h2>Registration</h2>
	<form name="Registration Form" method="post">
		<fieldset>
			<legend>Registration Form</legend>
			<label>Username: <span>*</span><input class="text" type="text" name="username"></label> <label>Email: <span>*</span><input class="email" type="email" name="email" autocomplete="off"></label>
			<label>Password: <span>*</span><input class="text" type="password" name="password"></label> <label>Confirm Password: <span>*</span><input class="text" type="password" name="conpwd">
			</label> <input class="button" value="Register" type="submit" onclick="check (this.form)" class="submitButton"> <input class="button" value="Cancel" type="reset" class="resetButton">
		</fieldset>
	</form>

	<script language="javascript">
		function check(form) {
			if (form.username.value == null || form.username.value == "") {
				alert("Name must be filled out");
				return false;
			}
			if (form.password.value == null || form.password.value == "") {
				alert("password must be filled out");
				return false;
			}
			if (form.conpwd.value == null || form.conpwd.value == "") {
				alert("password must be confirmed");
				return false;
			}

			if (form.password.value == form.conpwd.value) {
				alert("Account created successfully")
			} else {
				alert("Password mismatch")
			}

		}
	</script>
</body>

</html>

