<%-- 
    Document   : index
    Created on : Feb 6, 2018, 6:25:46 PM
    Author     : mjmersenski
--%>
<jsp:include page="header.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
    </head>
    <body>
        <!-- body content under the header -->
        <div class="jumbotron">
            <h1>Java Cycles</h1>
            <p class="lead">Java Cycles is the leading authority on new and fresh cycling trends.</p>
            <p><button id="learnMore" class="btn btn-primary btn-lg">Learn more &raquo;</button></p>
        </div>

        <script>
            $(document).ready(function () {
                //alert("this works");
                $('#learnMore').click(function () {
                    alert("You clicked this button, you're awesome!!!");
                });
            });
        </script>
    </body>
</html>

