<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: varunu28
  Date: 2/16/18
  Time: 8:23 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web App</title>
  </head>
  <body>
  <h1>Hello World</h1>
  <p>A JSP Page</p>

  <%
    Date date = new Date();
    out.print("<h2>" + date.toString() + "</h2>");
  %>
  </body>
</html>
