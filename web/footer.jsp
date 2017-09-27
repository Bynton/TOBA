<%-- 
    Document   : footer
    Created on : Sep 20, 2017, 10:20:31 PM
    Author     : bento
--%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<% 
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);  
%>
<p>&copy; Copyright <%= currentYear %> Benton Wilson &amp; Corp</p>
</body>
</html>
