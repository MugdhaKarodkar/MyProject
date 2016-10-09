<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "stylesheet" type="text/css" href="resources/css/pay.css">
</head>
<body>

	<div class="container">
	
		<div class="row-fluid">
		<div align="center">
		
			<form class="form-horizontal">
				
					<div id="legend">
						<legend class="">Payment</legend>
					</div>

					<!-- Name -->
					<div class="control-group">
						<label class="control-label" for="username">Card Holder's
							Name</label>
						<div class="controls">
							<input type="text" id="username" name="username" placeholder=""
								class="input-xlarge">
						</div>
					</div>

					<!-- Card Number -->
					<div class="control-group">
						<label class="control-label" for="email">Card Number</label>
						<div class="controls">
							<input type="text" id="email" name="email" placeholder=""
								class="input-xlarge">
						</div>
					</div>

					<!-- Expiry-->
					<div class="control-group">
						<label class="control-label" for="password">Card Expiry
							Date</label>
						<div class="controls">
							<select class="span3" name="expiry_month" id="expiry_month">
								<option></option>
								<option value="01">Jan (01)</option>
								<option value="02">Feb (02)</option>
								<option value="03">Mar (03)</option>
								<option value="04">Apr (04)</option>
								<option value="05">May (05)</option>
								<option value="06">June (06)</option>
								<option value="07">July (07)</option>
								<option value="08">Aug (08)</option>
								<option value="09">Sep (09)</option>
								<option value="10">Oct (10)</option>
								<option value="11">Nov (11)</option>
								<option value="12">Dec (12)</option>
							</select> <select class="span2" name="expiry_year">
								<option value="13">2013</option>
								<option value="14">2014</option>
								<option value="15">2015</option>
								<option value="16">2016</option>
								<option value="17">2017</option>
								<option value="18">2018</option>
								<option value="19">2019</option>
								<option value="20">2020</option>
								<option value="21">2021</option>
								<option value="22">2022</option>
								<option value="23">2023</option>
							</select>
						</div>
					</div>

					<!-- CVV -->
					<div class="control-group">
						<label class="control-label" for="password_confirm">Card
							CVV</label>
						<div class="controls">
							<input type="password" id="password_confirm"
								name="password_confirm" placeholder="" class="span2">
						</div>
					</div>

					<!-- Save card -->
					<div class="control-group">
						<div class="controls">
							<label class="checkbox" for="save_card"> <input
								type="checkbox" id="save_card" value="option1"> Save
								card on file?
							</label>
						</div>
					</div>

					<!-- Submit -->
					<div class="control-group">
						<div class="controls">
							 <a href="${flowExecutionUrl}&_eventId_submit">Pay</a> 
						
						</div>
					</div>

				
			</form>
			
		</div>
		
	</div>
	
</body>
</html>


