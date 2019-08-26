<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.0.0/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<h6><%=new java.util.Date()%></h6>
		<div class="container text-center">
			<h1>MENU DEL SISTEMA</h1>
		</div>
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-primary btn-lg btn-block" href="productos">Productos</a>
			</div>
		</div>
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-primary btn-lg btn-block" href="#">Clientes</a>
			</div>
		</div>
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-primary btn-lg btn-block" href="#">Proveedores</a>
			</div>
		</div>
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-primary btn-lg btn-block" href="#">Compras</a>
			</div>
		</div>
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-primary btn-lg btn-block" href="#">Facturacion</a>
			</div>
		</div>
	</div>
</body>
</html>