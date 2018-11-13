<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Crea una Mascota">
    <meta name="author" content="Reddema">
	<link rel="icon" href="ico.png">
	<title>Crear Mascota</title>

	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/sesion.css">
    <link href="https://fonts.googleapis.com/css?family=Chewy" rel="stylesheet">
</head>
<body>
<header>
	<nav class="navbar navbar-default navbar-sesion">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="/">
	        <img src="img/reddema.png">
	      </a>
	    </div>
	  </div>
	</nav>
</header>

<div class="container">

	<h1>Crea una mascota</h1>

	<form class="form-horizontal" action="ingresarMascota.jsp" method="get">
	  <div class="form-group">
	    <label class="col-sm-2 control-label">Nombre</label>
	    <div class="col-sm-10">
	     <input type="text" class="form-control" placeholder="Nombre" name="Nombre">
	    </div>
	  </div>
	  <div class="form-group">
	    <label class="col-sm-2 control-label">Edad</label>
	    <div class="col-sm-10">
	      <input type="text" class="form-control"  placeholder="Edad aproximada(años)" name="Edad">
	    </div>
	  </div>

	  <div class="form-group">
	  	<label class="col-sm-2 control-label">Tipo de mascota</label>
	  	<select class="form-control select-mascota" name="Tipo">
		  <option value="Perro">Perro</option>
		  <option value="Gato">Gato</option>
		  <option value="Loro">Loro</option>
		  <option value="Conejo">Conejo</option>
		</select>
	  </div>

	  <div class="form-group">
	  	<label class="col-sm-2 control-label">Estado</label>
	  	<select class="form-control select-mascota" name="Estado">
		  <option value="Adoptado">Adoptado</option>
		  <option value="En adopcion">En adopcion</option>
		  <option value="Critico">Critico</option>
		  <option value="Perdido">Perdido</option>
		  <option value="Encontrado">Encontrado</option>
		</select>
	  </div>

	  <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-10">
	      <button type="submit" class="btn btn-default">Crear</button>
	    </div>
	  </div>
	</form>
</div>

</body>
</html>