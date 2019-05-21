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
        <table>
             <tr>
                <th>Rooms Name</th><th>Room Number Bed</th><th>checkStart</th><th>checkEnd</th>
            </tr>
            <tr>
                <td>${search.name}</td><td>${search.number}</td><td>${search.start}</td><td>${search.end}</td>
            </tr>
            <tr>
                <th>Rooms ID</th>
                <th>Room Name</th>
                <th>Room Description</th>
                <th>Room Price</th>
                <th>Room Number Bed</th>
                <th>Add To Cart</th>
            </tr>
            <c:forEach var="room" items="${roomsList}" >
                <tr>                   
                    <td>${room.roomId}</td>
                    <td>${room.roomName}</td>
                    <td>${room.roomDescription}</td>
                    <td>${room.roomPrice}</td>
                    <td>${room.roomNumberBed}</td>            
                    <td><button onclick="location.href='${pageContext.request.contextPath}/addCart/${room.roomId}/${search.start}h' ">Add To Cart</button></td>          
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
