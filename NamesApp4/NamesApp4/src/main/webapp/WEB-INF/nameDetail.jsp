<%-- 
    Document   : nameDetail
    Created on : Feb 6, 2018, 8:25:34 PM
    Author     : mjmersenski
--%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Name Detail</h1>
        <table>
            <tr>
                <td>First: <c:out value="${name.first}"/></td>
            </tr>
            <tr>
                <td>Last: <c:out value="${name.last}"/></td>
            </tr>
            <tr>
                <td>Address: <c:out value="${name.address.street}"/></td>
            </tr>
            <tr>
                <td>City: <c:out value="${name.address.city}"/></td>
            </tr>
            <tr>
                <td>State: <c:out value="${name.address.state}"/></td>
            </tr>
            <tr>
                <td>Zip: <c:out value="${name.address.zip}"/></td>
            </tr>
        </table>
    </body>
</html>
