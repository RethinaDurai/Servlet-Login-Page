<%--
  Created by IntelliJ IDEA.
  User: varunu28
  Date: 2/16/18
  Time: 8:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login</title>
</head>
<body>

  <h1>Welcome. Please login</h1>

  <form action="/login" method="post">
    login-name: <input type="text" name="login-name" width="30"/>
    password: <input type="password" name="password" width="10"/>
    <input type="submit" value="Login"/>
  </form>

  <p style="color:yellow">${errorMessage}</p>

</body>
</html>
