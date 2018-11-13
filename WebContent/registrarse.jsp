<%@ page language="java" contentType="text/html"; charset="utf-8" pageEncoding="ISO-8859-1"%>
<%@ page import="anses.usuario" %> <!-- aca no se cual seria el mio reddema.Usuario?-->
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Crea una cuenta en Reddema y sé parte de la comunidad de mascotas más grande">
    <meta name="author" content="Reddema">
    <link rel="icon" href="../../favicon.ico">


    <link rel="icon" href="ico.png">

    <title>Reddema, Red de Mascotas!</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/inicio.css">
    <link href="https://fonts.googleapis.com/css?family=Chewy" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
  </head>

  <% usuario  reg = (Registro)session.getAttribute("Registro");%> <!--modificar-->

  <body class="registrarse">

    <header>
     <nav class="navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse barraprincipal">
      <button class="navbar-toggler navbar-toggler-right hidden-lg-up botonmenu" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <!-- Parte movil -->
<!--       <div id="contenedor">
        <div class="item item-1">
          <a href="index.html" class="iconomovil"><img src="ico.png" ></a>
        </div>
        <div class="item item-2">
          <form class=" buscadorchico">
              <input class="form-control inputbuscadorchico" type="text" placeholder="Buscar ">
              <button class="btn btn-outline-success  botondebusqueda" type="submit"><img src="img/iconos/ico/glyphicons-28-search.png"></button>
            </form>
        </div>
      </div> -->

   <!-- Fin parte movil -->

      <a class="navbar-brand logoinicio" href="index.html"><img src="img/reddema.png"></a>
      <div class="collapse navbar-collapse" id="navbarsExampleDefault">

        <form class="form-inline mt-2 mt-md-0 buscadorgrande" >
          <input class="form-control mr-sm-2 inputbuscador" type="text" placeholder="Buscar en Reddema">
          <button class="btn btn-outline-success my-2 my-sm-0 botondebusqueda" type="submit"><img src="img/iconos/ico/glyphicons-28-search.png"></button>
        </form>

        <ul class="navbar-nav ml-auto botonesderechos ">

          

          <li class="nav-item ">
            <a class="nav-link" href="iniciarsesion.html">Iniciar Sesión <span class="sr-only"></span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="registrarse.html">Registrarse</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="adopta.html">Adoptá</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="ayuda.html">Ayuda</a>
          </li>
        </ul>
        


      </div>
    </nav>

    </header>



<div class="formulariosesion">
  
<div class="container">

      <form class="form-signin" action="validarregistro.jsp" method="get">
        <h2 class="form-signin-heading fuenteformr">Crear una cuenta en Reddema</h2>

       
        
        
        <input type="text" name="nombre" class="form-control sinbordes" placeholder="Nombre" id="inputname">

        <input type="text" name="apellido" class="form-control sinbordes" placeholder="Apellido" id="inputlastname">
        <input type="text" name="usuario" class="form-control sinbordes" placeholder="Usuario">
        <input type="email" id="inputEmail" class="form-control sinbordes" name="email" placeholder="Email" required>
        <input type="password" name="clave" id="inputPassword" class="form-control contrados sinbordes" placeholder="Contraseña" required>
        <input type="password" name="clave2" id="inputPassword2" class="form-control contrados sinbordes" placeholder="Reingrese la contraseña" required>

         <label>Dia</label>
                <select class="form-control" name="dia">
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
                  <option value="6">6</option>
                  <option value="7">7</option>
                  <option value="8">8</option>
                  <option value="9">9</option>
                  <option value="10">10</option>
                  <option value="11">11</option>
                  <option value="12">12</option>
                  <option value="13">13</option>
                  <option value="14">14</option>
                  <option value="15">15</option>
                  <option value="16">16</option>
                  <option value="17">17</option>
                  <option value="18">18</option>
                  <option value="19">19</option>
                  <option value="20">20</option>
                  <option value="21">21</option>
                  <option value="22">22</option>
                  <option value="23">23</option>
                  <option value="24">24</option>
                  <option value="25">25</option>
                  <option value="26">26</option>
                  <option value="27">27</option>
                  <option value="28">28</option>
                  <option value="29">29</option>
                  <option value="30">30</option>
                  <option value="31">31</option>
                </select>

                <label>Mes</label>
                <select class="form-control" name="dia">
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
                  <option value="6">6</option>
                  <option value="7">7</option>
                  <option value="8">8</option>
                  <option value="9">9</option>
                  <option value="10">10</option>
                  <option value="11">11</option>
                  <option value="12">12</option>
                </select>

                <label>Año</label>
                <input type="text" name="anio" class="form-control sinbordes">


        
        <button class="btn btn-lg btn-primary btn-block botonform" type="submit">Registrarse</button>
      </form>

    </div> <!-- /container -->



</div>


    
<footer class="footer">
  <div class="container">
    <span><a href="reddema.html">Acerca de Reddema</a></span>
    <span><a href="">Terminos y condiciones</a></span>  
  </div>
</footer>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
  <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
