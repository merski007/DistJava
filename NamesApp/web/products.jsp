<%-- 
    Document   : index
    Created on : Feb 6, 2018, 6:25:46 PM
    Author     : mjmersenski
--%>

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
        <form method="get" action="NameController" class="navbar-form navbar-left">
          <div class="form-group">
            <input type="text" class="form-control" name="search" placeholder="Search">
          </div>
          <button type="submit" class="btn btn-default"><i class="fas fa-search"></i></button>
        </form>
        
    </div><!-- /.navbar-collapse -->      
    </div>
    </nav>
      
    <!-- body content under the header -->
    
    <h2>Products</h2>
    <h4>Check out fresh selection below</h4>
    <table class="table table-hover table-responsive">
        <thead>
            <tr class="font-md">
                <th>Product Name</th>
                <th>Description</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <tr class="product-row" id="prod1">
                <td><a href="productDetails.jsp">Trek Madone 9.9</a></td>
                <td>It doesn't get better than this. Madone 9.9 is the final stop in your search for a top-of-the-line superbike. It's the choice of the pros of Trek-Segafredo, and for good reason: advanced road bike aerodynamics, light weight, the highest level parts spec, and the finest ride quality available.</td>
                <td>$11,999 - $12,499</td>
            </tr>
            <tr class="product-row" id="prod2">
                <td>Domane SLR 9 Disc</td>
                <td>Domane SLR 9 Disc makes no compromises. It's our top-of-the-line endurance road bike, and it's equipped with the best parts money can buy. A full Shimano Dura-Ace Di2 electronic drivetrain, Aeolus 3 D3 Disc carbon wheels, and Front and Adjustable Rear IsoSpeed make it a bike that's up for anything, from racing to epic solo days on rough roads.</td>
                <td>$11,999 - $12,499</td>
            </tr>
            <tr class="product-row" id="prod3">
                <td>Emonda SLR 9</td>
                <td>Emonda SLR 9 is the lightest road bike we make, and that's exactly why the pros of Trek-Segafredo ride it on the biggest climbs of the Grand Tours. A 700 Series OCLV Carbon frame, Aeolus 3 D3 carbon wheels, and a full Shimano Dura-Ace Di2 electronic drivetrain give you the ultimate lightweight advantage.</td>
                <td>$10,999 - $11,499</td>
            </tr>
            <tr class="product-row" id="prod4">
                <td>Boone 7 Disc</td>
                <td>Boone 7 Disc is our lightest, fastest cyclocross bike. It charges over barriers, through mud and sand pits, and can handle a heavy dose of beer spray from its top spot on the podium. This is our highest-end cyclocross build, with Front and Rear IsoSpeed, hydraulic disc brakes for all-condition stopping power, and a race-ready 1x11 drivetrain.</td>
                <td>$3,999</td>
            </tr>
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

