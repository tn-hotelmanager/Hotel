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
        <h1>Edit Sinh Vien MaSV</h1>
        <mvc:form modelAttribute="sinhvien" action="${pageContext.request.contextPath}/result">
            <table>
                <tr>
                    <td>Ma SV: </td>
                    <td><mvc:input path="maSV" readonly="true" value="${sinhvien.maSV}"/></td>
                </tr>
                <tr>
                    <td>Ho Ten SV: </td>
                    <td><mvc:input path="thongTinSV.hoTen" required ="true" value="${sinhvien.thongTinSV.hoTen}"/></td>
                </tr>
                <tr>
                    <td>Khoa Hoc: </td>
                    <td><mvc:input path="khoaHoc" required ="true" value="${sinhvien.khoaHoc}"/></td>
                </tr>               
                <tr>
                    <td>Lop: </td>
                    <td><mvc:input path="lop" required ="true" value="${sinhvien.lop}"/></td>
                </tr>
                <tr>
                     <td>Khoa: </td>
                     <td><mvc:select path="khoa.maKhoa" items="${khoaList}"  itemLabel="tenKhoa" itemValue="maKhoa"/></td>
                </tr>
                <tr>
                    <td>Hoc Phi: </td>
                    <td><mvc:input path="thongTinSV.hocPhi" required ="true" value="${sinhvien.thongTinSV.hocPhi}"/></td>
                </tr>               
                <tr>
                    <td>Ngay Sinh: </td>
                    <td><mvc:input path="thongTinSV.ngaySinh" type="date" value="${sinhvien.thongTinSV.ngaySinh}"/></td>
                </tr>
                 <tr>
                    <td>Gioi Tinh: </td>
                    <td><mvc:input path="thongTinSV.gioiTinh" required ="true" value="${sinhvien.thongTinSV.gioiTinh}"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="EDIT"></td>
                </tr>
            </table>
        </mvc:form>
    </body>
</html>
