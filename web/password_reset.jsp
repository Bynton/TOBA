<%-- 
    Document   : password_reset
    Created on : Sep 20, 2017, 8:35:19 PM
    Author     : bento
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:import url="/header.html" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
    </head>
    <body>
        <h1>Reset Password</h1>
        <label>Current Password: </label><span>${customer.password}</span><br>
        <form action="ResetPasswordServlet" method="post">
            New Password: <input type="password" name="newPassword" required><br>
            <input type="submit" value="Change Password">
        </form>
    </body>
</html>
<c:import url="/footer.jsp" />
