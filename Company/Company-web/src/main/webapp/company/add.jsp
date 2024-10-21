<%-- 
    Document   : add
    Created on : Oct 21, 2024, 7:57:48 PM
    Author     : dieptv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Company Page</title>
    </head>
    <body>
        <h1>Add Company Page</h1>
        <form method="post">
            <label>Company Name: </label>
            <input name="name" placeholder="Enter name" size="50"/>
            <br/>
            <br/>
            <label>Company Key </label>
            <input name="company_key" placeholder="Enter company key" size="50"/>
            <br/>
            <br/>
            <label>Description: </label>
            <input name="description" placeholder="Enter description" size="50"/>
            <br/>
            <br/>
            <label>Address: </label>
            <input name="address" placeholder="Enter address" size="50"/>
            <br/>
            <br/>
            <label>Enabled </label>
            <input type="checkbox" name="enabled" placeholder="Enter address"/>
            <br/>
            <br/>
            <button>Save</button>
        </form>
    </body>
</html>
