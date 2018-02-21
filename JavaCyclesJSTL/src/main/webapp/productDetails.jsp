<%-- 
    Document   : index
    Created on : Feb 6, 2018, 6:25:46 PM
    Author     : mjmersenski
--%>
<jsp:include page="header.jsp" />
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
    </head>
    <body>
        <!-- body content under the header -->
        <h2><c:out value="${product.name}" /></h2>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <p class="prodDetailDesc"><b>Manufacturer:</b> <c:out value="${product.name}" /></p>
                    <p class="prodDetailDesc"><b>Description:</b> <c:out value="${product.description}" /></p>
                </div>
                <div class="col-md-4">
                    <img src="css/images/<c:out value="${product.imageName}" />" alt="<c:out value="${product.name}" />" class="prodDetailImg">
                </div>
            </div>
        </div>
    </body>
</html>

