<%-- 
    Document   : counter
    Created on : Sep 30, 2024, 7:01:49 PM
    Author     : dieptv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        int counter = (int) request.getAttribute("counter");
    %>
    <body>
        <h1>Counter <%= counter %></h1>
    </body>
</html>
