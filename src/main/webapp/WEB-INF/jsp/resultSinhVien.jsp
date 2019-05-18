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
        <h1>Infomation  Sinh Vien</h1>
        <mvc:form modelAttribute="sinhvien" action="save">
            <table>
                <tr>
                    <td>Ho Ten SV: </td>
                    <td><mvc:input path="thongTinSV.hoTen" type="hidden" value="${sinhvien.thongTinSV.hoTen}"/>${sinhvien.thongTinSV.hoTen}</td>
                </tr>
                <tr>
                    <td>Khoa Hoc: </td>
                    <td><mvc:input path="khoaHoc" type="hidden" value="${sinhvien.khoaHoc}"/>${sinhvien.khoaHoc}</td>
                </tr>               
                <tr>
                    <td>Lop: </td>
                    <td><mvc:input path="lop" type="hidden" value="${sinhvien.lop}"/>${sinhvien.lop}</td>
                </tr>
                <tr>
                     <td>Khoa: </td>
                     <td><mvc:input path="khoa.maKhoa" type="hidden" value="${sinhvien.khoa.tenKhoa}"/>${sinhvien.khoa.maKhoa}</td>
                </tr>
                <tr>
                    <td>Hoc Phi: </td>
                    <td><mvc:input path="thongTinSV.hocPhi" type="hidden" value="${sinhvien.thongTinSV.hocPhi}"/>${sinhvien.thongTinSV.hocPhi}</td>
                </tr>               
                <tr>
                    <td>Ngay Sinh: </td>
                    <td><mvc:input path="thongTinSV.ngaySinh" type="hidden" value="${sinhvien.thongTinSV.ngaySinh}"/>${sinhvien.thongTinSV.getStringNgaySinh()}</td>
                </tr>
                 <tr>
                    <td>Gioi Tinh: </td>
                    <td><mvc:input path="thongTinSV.gioiTinh" type="hidden" value="${sinhvien.thongTinSV.gioiTinh}"/>${sinhvien.thongTinSV.gioiTinh}</td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>
                <tr>
                    <td><input type="button" value="Back"  onclick="javascript:history.go(-1);"></td>
                </tr>
                
            </table>
        </mvc:form>
    </body>
</html>
