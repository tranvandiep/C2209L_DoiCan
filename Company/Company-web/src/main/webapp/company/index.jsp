<%@page import="com.gokisoft.company.entities.Company"%>
<%@page import="java.util.List"%>

<%-- 
    Document   : index
    Created on : Oct 9, 2024, 7:36:54 PM
    Author     : dieptv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Page</title>
    </head>
    <body>
        <h1>Book Page</h1>
        <%
            List<Company> dataList = (List<Company>) request.getAttribute("dataList");
            int index = 0;
        %>
        
        <table border="1" cellpadding="3">
            <thead>
                <tr>
                    <th>STT</th>
                    <th>Name</th>
                    <th>Company Key</th>
                    <th>Description</th>
                    <th>Address</th>
                    <th>Enabled</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                for (Books item : dataList) {
                %>
                <tr>
                    <td><%= ++index %></td>
                    <td><%= item.getName() %></td>
                    <td><%= item.getCompanyKey() %></td>
                    <td><%= item.getDescription() %></td>
                    <td><%= item.getAddress() %></td>
                    <td><%= item.getEnabled() %></td>
                    <td>
                        <a href="#<%= item.getId() %>"><button>Edit</button></a>
                        <a href="#<%= item.getId() %>"><button>Remove</button></a>
                    </td>
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
    </body>
</html>
