<%--
  Created by IntelliJ IDEA.
  User: thapaniwas
  Date: 1/6/2019
  Time: 9:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Employees form</h1>
<form action="insert" method="post">
    <p1>Enter ID</p1>
    <input type="number" name="id">
    <br>
    <p1>Enter Name</p1>
    <input type="text" name="name">
    <br>
    <p1>Enter Contact</p1>
    <input type="text" name="contact">
    <br>
    <p1>Enter Address</p1>
    <input type="text" name="address">
    <br>
    <input type="submit" value="Insert">
</form>

</body>
</html>
