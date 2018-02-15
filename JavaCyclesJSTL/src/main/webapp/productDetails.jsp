<%-- 
    Document   : index
    Created on : Feb 6, 2018, 6:25:46 PM
    Author     : mjmersenski
--%>

<%@page import="edu.wctc.dj.week3.model.Bike"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/site.css">

    <!-- favicon -->
    <link rel='shortcut icon' type='image/x-icon' href='favicon-bicycle.ico' />

    <!-- google icons -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <!-- font awesome -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>

    <title>Java Cycles</title>
  </head>
  <body>
  <nav class="navbar navbar-default navbar-fixed-top">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.jsp">Java Cycles</a>
      </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
          <li><a href="index.jsp"><i class="fas fa-home"></i> Home <span class="sr-only">(current)</span></a></li>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><i class="fas fa-bicycle"></i> Products <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="products.jsp">Bikes</a></li>
              <li><a href="#">Clothing</a></li>
              <li><a href="#">Accessories</a></li>
              <!--
              <li role="separator" class="divider"></li>
              <li><a href="#">Separated link</a></li>
              <li role="separator" class="divider"></li>
              <li><a href="#">One more separated link</a></li>
              -->
            </ul>
            <li><a href="shoppingCart.jsp"><i class="fas fa-shopping-cart"></i> Shopping Cart </a></li>
          </li>
        </ul>

        <!-- search bar -->
        <form method="get" action="BikeController" class="navbar-form navbar-left">
          <div class="form-group">
            <input type="text" class="form-control" name="search" placeholder="Search">
          </div>
          <button type="submit" class="btn btn-default"><i class="fas fa-search"></i></button>
        </form>
        
    </div><!-- /.navbar-collapse -->      
    </div>
    </nav>
      
    <!-- body content under the header -->
    
<!--    <h2>Trek Madone 9.9</h2>
    <h4>Faster then FAST!!!!</h4>
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <p class="prodDetailDesc">It doesn't get better than this. Madone 9.9 is the final stop in your search for a top-of-the-line superbike. It's the choice of the pros of Trek-Segafredo, and for good reason: advanced road bike aerodynamics, light weight, the highest level parts spec, and the finest ride quality available.</p>
            </div>
            <div class="col-md-4">
                <img src="css/images/1478000_2018_A_1_MADONE_9_9_C_H2.jpg" alt="Madone 9.9" class="prodDetailImg">
            </div>
        </div>
    </div>-->

    <% 
        //List<Name> nameList = (List<Name>) request.getAttribute("nameList");
        Bike bike = (Bike) request.getAttribute("bike");
    %>

    <h2><%= bike.getModelName() %></h2>
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <p class="prodDetailDesc">Manufacturer: <%= bike.getManufacturer() %></p>
                <p class="prodDetailDesc">Description: <%= bike.getModelDescription() %></p>
            </div>
            <div class="col-md-4">
                <img src="css/images/<%= bike.getModelImage() %>" alt="<%= bike.getModelName() %>" class="prodDetailImg">
            </div>
        </div>
    </div>

    <!-- Optional JavaScript -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script>
        //insert javascript here
    </script>
  
  
  </body>
</html>

