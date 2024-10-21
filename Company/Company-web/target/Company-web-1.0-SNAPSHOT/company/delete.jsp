<%@page import="com.gokisoft.company.entities.Company"%>
<%-- 
    Document   : add
    Created on : Oct 21, 2024, 7:57:48 PM
    Author     : dieptv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
  Company company = (Company) request.getAttribute("company");  
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Company Page</title>
    </head>
    <body>
        <h1>Add Company Page</h1>
        <form method="post">
            <label>Company Name: <%= company.getName() %></label>
            <input type="hidden" name="id" \value="<%= company.getId() %>"/>
            <br/>
            <br/>
            <label>Company Key: <%= company.getCompanyKey() %></label>
            <br/>
            <br/>
            <label>Description: <%= company.getDescription() %></label>
            <br/>
            <br/>
            <label>Address: <%= company.getAddress() %></label>
            <br/>
            <br/>
            <label>Enabled: <%= company.getEnabled() == 1?"checked":"" %></label>
            <br/>
            <br/>
            <button>Save</button>
        </form>
    </body>
</html>
