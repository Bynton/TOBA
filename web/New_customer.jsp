<%-- 
    Document   : New_customer
    Created on : Aug 16, 2017, 1:45:50 PM
    Author     : bento
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:import url="/header.html" />
        <title>New Customer</title>
    </head>
    <body>
        <h1>New Customer</h1>
    </body>
    
    <form action="NewCustomerServlet" method="post">
            First Name: <input type="text" name="firstName" required><br>
            Last Name: <input type="text" name="lastName" required><br>
            Phone: <input type="text" name="phone" required><br>
            Address: <input type="text" name="address" required><br>
            City: <input type="text" name="city" required><br>
            State: <input type="text" name="state" required><br>
            Zipcode: <input type="text" name="zipcode" required><br>
            Email: <input type="email" name="email" required><br>
            
            
            <input type="submit" value="Register">
    </form>
    <c:import url="/footer.jsp" />
