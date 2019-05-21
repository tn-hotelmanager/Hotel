<%-- 
    Document   : results
    Created on : Apr 14, 2019, 11:25:20 AM
    Author     : duydld
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Order result!</h1>
        <table>
            <tr>
                <td>orderId</td>
                <td>${order.orderId}</td>
            </tr>
            <tr>
                <td>orderDate</td>
                <td>${order.orderDate}</td>
            </tr>
            <tr>
                <td>customerName</td>
                <td>${order.customerName}</td>
            </tr>
            <tr>
                <td>customerAdress</td>
                <td>${order.customerAdress}</td>
            </tr>
        </table>

        <table>
            <tr>
                <th>productId</th>
                <th>productName</th>
                <th>productDescription</th>
                <th>unitPrice</th>
                <th>quantity</th>
            </tr>
            <c:forEach var="o" items="${newOrderDetailsList}">
                <tr>
                    <td>${o.product.productId}</td>
                    <td>${o.product.productName}</td>
                    <td>${o.product.productDescription}</td>
                    <td>${o.product.unitPrice}</td>
                    <td>${o.quantity}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
