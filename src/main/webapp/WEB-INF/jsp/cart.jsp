<%-- 
    Document   : productList
    Created on : Apr 8, 2019, 10:10:41 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ProductList!</h1>
        <h2 style="color: red"><a href="${pageContext.request.contextPath}/checkOut">Check out</a></h2>
        <table>
             <tr>
                <th>Rooms ID</th>
                <th>Room Name</th>
                <th>Room Description</th>
                <th>Room Price</th>
                <th>Room Number Bed</th>
                <th>Start</th>
                <th>End</th>
                <th>Remove Cart</th>
            </tr>
            <c:forEach var="bo" items="${bookingDetailsList}">
                <tr>
                    <td>${bo.room.roomId}</td>
                    <td>${bo.room.roomName}</td>
                    <td>${bo.room.roomDescription}</td>
                    <td>${bo.room.roomPrice}</td>
                    <td>${bo.room.roomNumberBed}</td>
                    <td>${bo.bookingDetailsStart}</td>
                    <td>${bo.bookingDetailsEnd}</td>
                    <td><a href="${pageContext.request.contextPath}/removeCart/${bo.room.roomId}">Remove Cart</a></td>
                </tr>
            </c:forEach>

            <tr>
                <td colspan="4"><h2><a href="${pageContext.request.contextPath}/listRooms">Continue Booking</a><h2></td>
            </tr>

        </table>
    </body>
</html>
