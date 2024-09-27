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
  <h1>Edit Book</h1>
</div>
  
    <%
        Products p = (Products) request.getAttribute("product");
    %>
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-12">
        <form method="post" action="edit">
            <div class="form-group">
                <label>Title</label>
                <input required="true" class="form-control" name="title" placeholder="Enter title" value="<%= p.getTitle() %>"/>
                <input type="hidden" required="true" class="form-control" name="id" value="<%= p.getId()%>"/>
            </div>
            <div class="form-group">
                <label>Thumbnail</label>
                <input required="true" class="form-control" name="thumbnail" placeholder="Enter thumbnail" value="<%= p.getThumbnail()%>"/>
            </div>
            <div class="form-group">
                <label>Content</label>
                <textArea class="form-control" name="content" placeholder="Enter content" rows="3"><%= p.getContent()%></textArea>
            </div>
            <div class="form-group">
                <button class="btn btn-success">Save Product</button>
                <button type="reset" class="btn btn-danger">Reset</button>
                <p><a href="list">Back to list</a></p>
            </div>
        </form>
    </div>
  </div>
</div>
</body>
</html>
