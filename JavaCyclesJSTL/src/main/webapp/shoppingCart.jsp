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
        <h2>Shopping Cart</h2>
        <table class="table table-hover table-responsive">
            <thead>
                <tr class="font-md">
                    <td><b>Product Name</b></td>
                    <td><b>Qty</b></td>
                    <td><b>Unit Price</b></td>
                    <td><b>Total Price</b></td>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="cart" items="${productList}">
                    <tr class="product-row">
                        <td>${cart.product.name}</td>

                    </tr>        
                </c:forEach>
            </tbody>
        </table>
    <!--
        <table class="table table-hover table-responsive">
            <thead>
                <tr class="font-md">
                    <th>Product Name</th>
                    <th>Qty</th>
                    <th>Unit Price</th>
                    <th>Total Price</th>
                </tr>
            </thead>
            <tbody>
                <tr class="product-row" id="prod1">
                    <td>Trek Madone 9.9</td>
                    <td>1</td>
                    <td>$12,100</td>
                    <td>$12,100</td>
                </tr>
                <tr class="product-row" id="prod2">
                    <td>Domane SLR 9 Disc</td>
                    <td>2</td>
                    <td>$12,300</td>
                    <td>$24,600</td>
                </tr>
            </tbody>
        </table>
    -->
    </body>
</html>

