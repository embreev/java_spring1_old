<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <title>Products</title>
  </head>
  <body>
    <h1>Products</h1>

    <c:forEach items="${products}" var="product">
      <div>
        <p>${product.id}</p>
        <p>${product.title}</p>
        <p>${product.cost}</p>
      </div>
    </c:forEach>
  </body>
</html>
