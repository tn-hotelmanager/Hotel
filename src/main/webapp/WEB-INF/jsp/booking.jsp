<%-- 
    Document   : customerInfor
    Created on : Apr 13, 2019, 9:00:48 PM
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
        <h1>ORDER!</h1>
        <mvc:form modelAttribute="booking" action="saveBooking">
            <table>
                <tr>

                    <td><mvc:input path="bookingDetailsId" type="hidden"/></td>
                </tr>
                <tr>

                    <td><mvc:input path="orderDate" type="hidden"/></td>
                </tr>
                <tr>
                    <td>customerName</td>
                    <td><mvc:input path="customerName" required="true" placeholder="customerName"/></td>
                </tr>
                <tr>
                    <td>customerAdress</td>
                    <td><mvc:input path="customerAdress" required="true" placeholder="customerAdress"/></td>
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
                <c:forEach var="o" items="${orderDetailsList}">
                    <tr>
                        <td>${o.product.productId}</td>
                        <td>${o.product.productName}</td>
                        <td>${o.product.productDescription}</td>
                        <td>${o.product.unitPrice}</td>
                        <td>${o.quantity}</td>
                    </tr>
                </c:forEach>
            </table>       
            <button type="submit">Save Order</button>
        </mvc:form>
    </body>
</html>
