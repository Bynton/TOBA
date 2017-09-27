<%-- 
    Document   : index
    Created on : Aug 16, 2017, 1:43:04 PM
    Author     : bento
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/header.html" />
<!DOCTYPE html>
<html>
    <head>
        <title>TOBA Titan Online Banking</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>
            TOBA Titan Online Banking
        </h1>
        <c:if test="${message != null}">
            <p><i>${message}</i></p>
        </c:if>
        <h3>
            <a href="Login.html">Login</a><br>
            <a href="New_customer.jsp">New Customer</a><br>
            <a href="Account_activity.html">Account Activity</a><br>
            <a href="Transaction.html">Transaction</a><br>
            <a href="password_reset.jsp">Reset Password </a><br>
        </h3>
             
    </body>
</html>
<c:import url="/footer.jsp" />
