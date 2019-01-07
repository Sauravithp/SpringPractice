<%--
  Created by IntelliJ IDEA.
  User: thapaniwas
  Date: 1/6/2019
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All data</title>
</head>
<body>
<h1>The required data are</h1>
 ${EmpInfo}
<br>
<p>Do you want to add more employee</p>
<form action="/" method="post">
    <input type="submit" value="Insert">
</form>

<p>Do yo wanna delete the inseretd value</p>
<form action="delete" method="post">
    <p1>Enter ID</p1>
    <input type="number" name="id">
    <br>
    <input type="submit" value="Delete">
</form>
</body>
</html>
