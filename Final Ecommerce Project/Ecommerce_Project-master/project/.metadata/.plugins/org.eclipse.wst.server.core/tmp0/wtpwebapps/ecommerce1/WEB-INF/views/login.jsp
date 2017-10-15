<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!--  <link rel="stylesheet" href="css/bootstrap.min.css">-->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	 <style type="text/css">
  	.btn{
  		background-color: #6A5ACD; 
  		box-shadow: 3px 3px 6px grey;
  		color: white;
  	}

  	.btn:hover{
  		background-color: #00FF7F;
  		box-shadow: 2px 2px 4px grey;
  	}
  	.reg:hover{
  		color:green;
  	}
  </style>
 
</head>
<body >
<div class="container-fluid">
<%@include file="shared/navbar.jsp" %>
<!-- login form starts -->
<c:if test="${not empty error}">
				<div class="col-md-4" style="background-color:#E45649; border-radius:7px;">${error}</div>
			</c:if>
<div class="row">
	<div class="col-md-6" style="margin-left: 25%; ">
  				<div><p style="color: red; margin-left: 40%; font-size: 24px; text-shadow: 3px 3px 5px grey; ">LOGIN </p></div>
			
  			<form action="/ecommerce1/login" method="post" >
  				<div class="form-group">
  					<label>Enter Email:</label><span style="color: red">*</span>
  					<input type="text" name="username" class="form-control" placeholder="Enter Your Email">
  				</div>

  				<div class="form-group">
  					<label>Password:</label><span style="color: red">*</span>
  					<input type="Password" name="password" class="form-control" placeholder="Enter Your Password">
  				</div>

  				<div style="margin-left: 30% ">
  					<input type="submit" value="Log IN" class="btn" style="margin-right: 10%; padding-right: 25px; padding-left: 25px">
  					<p style="float:right; margin-right:30%; color:red; text-shadow:2px 2px 3px grey; margin-top:2%;">New User ? <a href="registerpage" class="reg">Register Here</a></p>
  					
  				</div>
  			</form>
  			 
  		</div>
</div>
<!-- login ends -->
</div>
</body>
</html>