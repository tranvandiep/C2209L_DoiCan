<%-- 
    Document   : register
    Created on : Oct 9, 2024, 7:36:44 PM
    Author     : dieptv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form method="post">
            <label>
                Email
                <input type="email" name="email" placeholder="Enter email"/>
            </label>
            <br/>
            <label>
                Password
                <input type="password" name="pwd" placeholder="Enter pwd"/>
            </label>
            <br/>
            <br/>
            <button>Login</button>
            <p>
                <a href="RegisterServlet">Create a new account</a>
            </p>
        </form>
    </body>
</html>
