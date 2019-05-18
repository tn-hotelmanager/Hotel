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
        <h1>Sinh Vien List</h1>
        <div>
            <mvc:form modelAttribute="sinhvien" action="search">
            <table>               
                 <label>Search for</label>
                 <mvc:select path="criteria" name="criteria">
                     <mvc:option value="maSV">Ma SV</mvc:option>
                     <mvc:option value="maKhoa">Ma Khoa</mvc:option>
                 </mvc:select>
<!--                <select name="criteria">
                    <option  value="maSV">Ma SV</option>
                    <option value="khoaHoc">Khoa Hoc</option>
                    <option value="lop">Lop</option>
                    <option value="maKhoa">Ma Khoa</option>
                    <option value="tenKhoa">Ten Khoa</option>
                    <option value="hoTen">Ho Ten</option>
                    <option value="hocPhi">Hoc Phi</option>
                    <option value="ngaySinh">Ngay Sinh</option>
                    <option value="gioiTinh">Gioi Tinh</option>
                </select><br><br>-->
                <label>Search value</label>
                <input type="text" name="searchValue" value="" /><br><hr>
                <input type="submit" value="Search" />
            </table>
            </mvc:form>
        </div>       
        <table>
            <tr>
                <th>Ma SV</th>
                <th>Khoa Hoc</th>
                <th>Lop</th>
                <th>MaKhoa SV</th>
                <th>Ten Khoa</th>
                <th>Giao Vien GD</th>
                <th>Ho Ten SV</th>
                <th>Hoc Phi</th>
                <th>Ngay Sinh</th>
                <th>Gioi Tinh</th>
            </tr>
            <c:forEach var="sv" items="${sinhvienList}" >
                <tr>
                    <td>${sv.maSV}</td>
                    <td>${sv.khoaHoc}</td>
                    <td>${sv.lop}</td>
                    <td>${sv.khoa.maKhoa}</td>
                    <td>${sv.khoa.tenKhoa}</td>
                    <td>${sv.khoa.gvgd}</td>
                    <td>${sv.thongTinSV.hoTen}</td>
                    <td>${sv.thongTinSV.getStringHocPhi()}</td>
                    <td>${sv.thongTinSV.getStringNgaySinh()}</td>
                    <td>${sv.thongTinSV.gioiTinh}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
