<%@page import="com.gokisoft.banking.entities.Accounts"%>
<%@page import="java.util.List"%>

<%-- 
    Document   : index
    Created on : Oct 7, 2024, 7:56:50 PM
    Author     : dieptv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
List<Accounts> dataList = (List<Accounts>) request.getAttribute("dataList");
int index = 0;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Management</title>
    </head>
    <body>
        <h1>Account Management</h1>
        
        <table border="1" cellpadding="3">
            <thead>
                <tr>
                    <th>STT</th>
                    <th>Account Number</th>
                    <th>Full Name</th>
                    <th>Amount</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                for (Accounts item : dataList) {
                %>
                <tr>
                    <td><%= ++index %></td>
                    <td><%= item.getAccountNum() %></td>
                    <td><%= item.getFullname() %></td>
                    <td><%= item.getAmount() %></td>
                    <td>
                        <a href="WithdrawServlet?id=<%= item.getId() %>"><button>Withdraw</button></a>
                        <a href="TransactionServlet?id=<%= item.getId() %>"><button>Transaction</button></a>
                    </td>
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
    </body>
</html>
