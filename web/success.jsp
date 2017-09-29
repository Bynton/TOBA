<%-- 
    Document   : success
    Created on : Sep 20, 2017, 7:51:42 PM
    Author     : bento
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:import url="/header.html" />
<html>
    <h1>
            Success ${customer.firstName}!
        </h1>
        <div>Your account has been created.</div><br>
        <label>First Name: </label><span>${customer.firstName}</span><br>
        <label>Last Name: </label><span>${customer.lastName}</span><br>
        <label>Phone: </label><span>${customer.phone}</span><br>
        <label>Address: </label><span>${customer.address}</span><br>
        <label>City: </label><span>${customer.city}</span><br>
        <label>State: </label><span>${customer.state}</span><br>
        <label>Zipcode: </label><span>${customer.zipcode}</span><br>
        <label>Username: </label><span>${customer.username}</span><br>
        <label>Password: </label><span>${customer.password}</span><br>
        <a href="index.html">Home</a>
</html>