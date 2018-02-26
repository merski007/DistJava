<%-- 
    Document   : index
    Created on : Feb 6, 2018, 6:25:46 PM
    Author     : mjmersenski
--%>
<jsp:include page="header.jsp" />
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
    </head>
    <body>
        <table class="table table-hover table-responsive">
            <thead>
                <tr class="font-md">
                    <td><b>Manufacturer</b></td>
                    <td><b>Model Name</b></td>
                    <td><b>Price</b></td>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="product" items="${productList}">
                    <tr class="product-row">
                        <td><a href="ProductController?id=${product.prodId}">${product.brand}</a></td>
                        <td>${product.name}</td>
                        <td><fmt:formatNumber value = "${product.price}" type = "currency" /></td>
                    </tr>        
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

