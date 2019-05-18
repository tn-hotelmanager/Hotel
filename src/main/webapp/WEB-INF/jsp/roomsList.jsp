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
            table {border: 1px solid #000000; margin: 15px auto;}
            h1{text-align: center; color: red; text-shadow: 2px 2px #ff0000;    }
            h2{text-align: center; }
            th, td{border: 1px solid #000000; text-align: center; padding: 10px;}
            th{color: red;}
            td{color: green;}
            div{border: 1px solid #000000; margin: 0 auto; width: 20em; padding: 10px;}
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
                    <td><button onclick="location.href='${pageContext.request.contextPath}/edit/${room.roomId}' ">Booking</button></td>
                    <td><button onclick="location.href='${pageContext.request.contextPath}/delete/${room.roomId}' ">Delete</button></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
