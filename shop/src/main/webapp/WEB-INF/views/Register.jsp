<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="resources/css/style1.css">
</head>
<body>


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
				<li><a href="Login"><span
						class="glyphicon glyphicon-log-in"></span>Login</a></li>
				
			</ul>
		</div>
	</nav>




	<form:form modelAttribute="user" method="post" action="saveUser">
		<div class="register">
			<div class="register-screen">
				<div class="app-title">
					<h1>Register</h1>
				</div>

				<div class="register-form">
					<div class="control-group">
						<form:input path="user_id" type="text" class="register-field" value="" name="user_id" placeholder="user_id" id="register-id" required="true"></form:input>
						<form:label path="user_id" class="register-field-icon fui-user"
							for="register-id"></form:label>
					</div>
					<div class="control-group">
						<form:input path="name" type="text" class="register-field"
							value="" name="name" placeholder="name" id="register-name" required="true"></form:input>
						<form:label path="name" class="register-field-icon fui-user"
							for="register-name"></form:label>
					</div>
					
					<div class="control-group">
						<form:input path="mail" type="email" class="register-field"
							value="" name="mail" placeholder="mail" id="register-mail" required="true"></form:input>
							<form:label path="mail" class="register-field-icon fui-lock" for="register-mail"></form:label>
					</div>
					 <div class="control-group">
						<form:password path="password" class="register-field"
							value="" name="password" placeholder="password"
							id="register-pass" required="true"></form:password>
							<form:label  path="password" class="register-field-icon fui-lock" for="register-pass"></form:label>
					</div>
					<div class="control-group">
						<form:password path="confirm_password" class="register-field"
							value="" name="confirm_password" placeholder="confirm_password"
							id="register-pass" required="true"></form:password>
							<form:label  path="confirm_password" class="register-field-icon fui-lock" for="register-pass"></form:label>
					</div>
				
					
					<div class="control-group">
						<form:input path="contact" type="text" class="register-field"
							value="" name="contact" placeholder="contact"
							id="register-contact" required="true"></form:input>
							<form:label path="contact" class="register-field-icon fui-lock"
								for="register-contact">
								</form:label>
					</div>
					<div class="control-group">
						<form:input path="address" type="text" class="register-field"
							value="" name="address" placeholder="address"
							id="register-address" required="true"></form:input>
							<form:label path="address" class="register-field-icon fui-lock"
								for="register-address">
								</form:label>
					</div>
					
					<input class="btn btn-primary btn-large btn-block" type="submit"/>
						<br>
						<input class="btn btn-primary btn-large btn-block" type="reset" value="Cancel"/>
				</div>
			</div>
		</div>
	</form:form>
</body>

</html>
