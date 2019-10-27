<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
  <head>
    <title>Home</title>
  </head>
  <body>
    <form:form modelAttribute="addProduct"  method="post">
      <form:label path="id">
        Product_ID
      </form:label>
      <form:input path="id" />
      </p>
      <form:label path="title">
        Product Title
      </form:label>
      <form:input path="title" />
      </p>
      <form:label path="cost">
        Product Cost
      </form:label>
      <form:input path="cost" />
      <button type="submit">Save</button>
    </form:form>
  </body>
</html>