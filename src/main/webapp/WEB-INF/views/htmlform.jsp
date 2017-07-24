<%--
  Created by IntelliJ IDEA.
  User: kuwu
  Date: 2017/07/21
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Coffee Choices</title>
</head>
<body>
<form method="post" action = "/success">
Customer Name: <input type="text" name="c_name">
<br>
Coffee Type: <input type="text" name="c_type">
    <br>

    <h3>Coffee Options</h3>
    Decaf<<input type="checkbox" name="options" value="Decaf"checked>
    <br>
    Extra Bold<<input type="checkbox" name="options" value="ExtraBold">
    <br>

    <h3>Gender</h3>
    <input type="radio" name="gender" value="male" checked>Male
    <br>
    <input type="radio" name="gender" value="female" >Female
    <br>
    <input type="radio" name="gender" value="other" >Other
    <br>
    <input type="submit" value="Submit Order">
</form>
</body>
</html>
