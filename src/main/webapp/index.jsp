<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Nhập từ tiếng anh vào bên dưới để tìm kiếm (Rất hạn chế)</h1>
  <form action="/search" method="get">
    <input type="text" name="word">
    <button type="submit">Tìm</button>
  </form>
  <h1>${result}</h1>
  </body>
</html>
