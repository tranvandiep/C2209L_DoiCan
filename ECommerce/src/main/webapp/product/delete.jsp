<%@page import="com.gokisoft.ecommerce.entities.Products"%>
<!DOCTYPE html SYSTEM "http://www.thymeleaf.org/dtd/xhtml1-strict-thymeleaf-4.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
  <title>Input Book</title>
  <meta charset="utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1"/>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"/>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  <style>
      .form-group {
          margin-bottom: 20px;
      }
  </style>
</head>
<body>

<div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>Delete Product</h1>
</div>
  
    <%
        Products p = (Products) request.getAttribute("product");
    %>
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-12">
        <form method="post" action="delete">
            <div class="form-group">
                <label>Title: <%= p.getTitle() %></label>
                <input type="hidden" required="true" class="form-control" name="id" value="<%= p.getId()%>"/>
            </div>
            <div class="form-group">
                <label>Thumbnail</label>
                <img src="<%= p.getThumbnail()%>" style="width: 200px"/>
            </div>
            <div class="form-group">
                <label>Content</label>
                <p><%= p.getContent()%></p>
            </div>
            <div class="form-group">
                <button class="btn btn-danger">Confirm Delete Product</button>
                <p><a href="list">Back to list</a></p>
            </div>
        </form>
    </div>
  </div>
</div>
</body>
</html>
