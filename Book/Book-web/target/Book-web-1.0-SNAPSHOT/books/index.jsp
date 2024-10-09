<%@page import="com.gokisoft.book.entities.Books"%>
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
            List<Books> dataList = (List<Books>) request.getAttribute("dataList");
            int index = 0;
        %>
        
        <table border="1" cellpadding="3">
            <thead>
                <tr>
                    <th>STT</th>
                    <th>Book Name</th>
                    <th>Price</th>
                    <th>Author Name</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                for (Books item : dataList) {
                %>
                <tr>
                    <td><%= ++index %></td>
                    <td><%= item.getBookName() %></td>
                    <td><%= item.getPrice() %></td>
                    <td><%= item.getAuthorName() %></td>
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
