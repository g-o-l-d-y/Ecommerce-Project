<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
%>
<%@include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<div class="container">
			<br>
			<form action="perform_login" method="POST">
				<div class="form-group row">
    			<label for="userName" class="col-sm-2 col-form-label"><h4><b>Username</b></h4></label>
    			<div class="col-sm-3">
    				<input type="text" class="form-control" name="userName">
    			</div>
	    		</div>
	    		<div class="form-group row">
	    			<label for="password" class="col-sm-2 col-form-label"><h4><b>Password</b></h4></label>
	    			<div class="col-sm-3">
	    				<input type="password" class="form-control" name="password">
	    			</div>
    			</div>
    			<button type="submit" class="btn btn-primary" style="">  Login  </button>
    		</form>
		</div>
	</body>
</html>