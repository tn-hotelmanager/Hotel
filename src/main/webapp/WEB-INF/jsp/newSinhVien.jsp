<%-- 
    Document   : newProduct
    Created on : Mar 30, 2019, 9:09:02 PM
    Author     : ASUS
--%>
<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add New</h1>
        <mvc:form modelAttribute="sinhvien" action="result">
            <table>
                <tr>
                    <td>Ho Ten SV: </td>
                    <td><mvc:input path="thongTinSV.hoTen" required ="true" placeholder="Ho Ten SV"/></td>
                </tr>
                <tr>
                    <td>Khoa Hoc: </td>
                    <td><mvc:input path="khoaHoc" required ="true" placeholder="Khoa Hoc"/></td>
                </tr>               
                <tr>
                    <td>Lop: </td>
                    <td><mvc:input path="lop" required ="true" placeholder="Lop"/></td>
                </tr>
                <tr>
                     <td>Khoa: </td>
                     <td><mvc:select path="khoa.maKhoa" items="${khoaList}"  itemLabel="tenKhoa" itemValue="maKhoa"/></td>
                </tr>
                <tr>
                    <td>Hoc Phi: </td>
                    <td><mvc:input path="thongTinSV.hocPhi" required ="true" placeholder="Hoc Phi"/></td>
                </tr>               
                <tr>
                    <td>Ngay Sinh: </td>
                    <td><mvc:input path="thongTinSV.ngaySinh" type="date"/></td>
                </tr>
                 <tr>
                    <td>Gioi Tinh: </td>
                    <td><mvc:input path="thongTinSV.gioiTinh" required ="true" placeholder="Gioi Tinh"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="AddNew"></td>
                </tr>
            </table>
        </mvc:form>
    </body>
</html>
