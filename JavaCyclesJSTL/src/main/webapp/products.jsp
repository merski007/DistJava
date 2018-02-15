<%-- 
    Document   : index
    Created on : Feb 6, 2018, 6:25:46 PM
    Author     : mjmersenski
--%>

<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
                    <a class="navbar-brand" href="index.html">Java Cycles</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="index.html"><i class="fas fa-home"></i> Home <span class="sr-only">(current)</span></a></li>
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

        <table class="table table-hover table-responsive">
            <thead>
                <tr class="font-md">
                    <td><b>Manufacturer</b></td>
                    <td><b>Model Name</b></td>
                    <td><b>Price</b></td>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="bike" items="${bikeList}">
                    <tr class="product-row">
                        <td><a href="BikeController?id=${bike.id}">${bike.manufacturer}</a></td>
                        <td>${bike.modelName}</td>
                        <td>${bike.price}</td>
                    </tr>        
                </c:forEach>
            </tbody>
        </table>

        <!-- Optional JavaScript -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            //insert javascript here
        </script>


    </body>
</html>

