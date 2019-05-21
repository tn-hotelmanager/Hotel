<%-- 
    Document   : productList
    Created on : Mar 30, 2019, 8:35:02 PM
    Author     : ASUS
--%>
<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            <%@ include file="/WEB-INF/css/newcss.css"%>
        </style>
        
    </head>
    <body>
        <h1>Rooms List</h1> 
        <div>
            <mvc:form action="search">
            <table>               
                <label>Search RoomType</label>
                   <select name="room">
                        <option value="normal">Room normal</option>
                        <option value="super">super</option>
                        <option value="deluxe">deluxe</option>
                    </select><br><br>
                <label>Search Number Bed</label>
                <select name="numberBed">
                    <option value="number1">1 giường</option>
                    <option value="number2">2 giường</option>
                </select><br><br>
                <label>Search Day Start</label>
                <input type="date" name="searchStart" value="" /><br>
                <label>Search Day End</label>
                <input type="date" name="searchEnd" value="" /><br><hr>
                <input type="submit" value="Search" />
            </table>
            </mvc:form>
        </div> 
        <h2><a href="new">Add New</a></h2>
        <table>
            <tr>
                <th>Rooms ID</th>
                <th>Room Name</th>
                <th>Room Description</th>
                <th>Room Price</th>
                <th>Room Number Bed</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach var="room" items="${roomsList}" >
                <tr>                   
                    <td>${room.roomId}</td>
                    <td>${room.roomName}</td>
                    <td>${room.roomDescription}</td>
                    <td>${room.roomPrice}</td>
                    <td>${room.roomNumberBed}</td>       
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
