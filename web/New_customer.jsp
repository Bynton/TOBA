<%-- 
    Document   : New_customer
    Created on : Aug 16, 2017, 1:45:50 PM
    Author     : bento
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:import url="/header.html" />
<%@ page import="java.sql.*"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
</html>
<c:import url="/footer.jsp" />