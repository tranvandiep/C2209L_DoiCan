<%@page import="com.gokisoft.banking.entities.Accounts"%>
<%@page import="java.util.List"%>

<%-- 
    Document   : withdraw
    Created on : Oct 7, 2024, 7:57:13 PM
    Author     : dieptv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
Accounts item = (Accounts) request.getAttribute("item");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transaction Page</title>
    </head>
    <body>
        <h1>Hello: <%= item.getFullname() %></h1>
        
        <form method="post">
            <input type="hidden" value="<%= item.getId() %>"/>
            <input type="number" name="money" min="0"/>
            <button>Start to add money</button>
        </form>
    </body>
</html>
