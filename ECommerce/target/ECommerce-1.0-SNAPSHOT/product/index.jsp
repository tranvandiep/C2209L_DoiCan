<%@page import="com.gokisoft.ecommerce.entities.Products"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>Book Management</title>
  <meta charset="utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1"/>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<% 
    List<Products> dataList = (List<Products>) request.getAttribute("dataList");
    int index = 0;
%>
    
<div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>Product List</h1>
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-12">
      <a href="/book/input"><button class="btn btn-success">Add new book</button></a>
      <table class="table">
        <thead>
          <tr>
            <th>No</th>
            <th>Title</th>
            <th>Thumbnail</th>
            <th>Content</th>
            <th>Updated At</th>
          </tr>
        </thead>
        <tbody>
        <%
            for (Products item : dataList) {
        %>
            <tr>
                <td><%= ++index %></td>
                <td><%= item.getTitle() %></td>
                <td>
                    <img src="<%= item.getThumbnail()%>" style="width: 200px"/>
                </td>
                <td><%= item.getContent()%></td>
                <td><%= item.getUpdatedAt()%></td>
              </tr>
        <%
            }
        %>
        </tbody>
      </table>
    </div>
  </div>
</div>
</body>
</html>
