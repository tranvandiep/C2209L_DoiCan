<%@page import="com.gokisoft.demoejb.entities.Students"%>
<%@page import="java.util.List"%>

<%-- 
    Document   : index
    Created on : Oct 4, 2024, 7:35:50 PM
    Author     : dieptv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student List</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    </head>
    <body>
        <h1>Student List</h1>
        <%
           List<Students> dataList = (List<Students>) request.getAttribute("dataList");
           int index = 0;
        %>
        
        <table border="1" cellpadding="3">
            <tr>
                <th>Roll Number</th>
                <th>Name</th>
                <th>Email</th>
                <th>Age</th>
                <th>Delete</th>
            </tr>
            <%
            for (Students item : dataList) {
            %>
                <tr>
                    <td><%= item.getRollnumber() %></td>
                    <td><%= item.getName()%></td>
                    <td><%= item.getEmail()%></td>
                    <td><%= item.getAge()%></td>
                    <th>
                        <button class="btn btn-danger" onclick="deleteStudent('<%= item.getRollnumber()%>')">Delete</button>
                    </th>
                  </tr>
            <%
                }
            %>
        </table>
        
        <script>
            function deleteStudent(rollnumber) {
                if(confirm("Ban chac chan muon xoa sinh vien nay khong")) {
                    $.post("StudentServlet", {
                        rollnumber: rollnumber
                    }, function(data) {
                        location.reload()
                    })
                }
            }
        </script>
    </body>
</html>
