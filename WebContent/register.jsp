<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method ="post" action ="loginReg">
<table style="background-colour:violet;margin-left:20px">
<tr>
<td ><h3>Registration Page</h3></td>
<td></td>


<tr>
<td>First Name:</td><td><input type ="text" name ="fName"/></td>
</tr>
<tr>
<td>Middle Name:</td><td><input type ="text" name ="mName"/></td>
</tr>
<tr>
<td>Last Name:</td><td><input type ="text" name ="lName"/></td>
</tr>

<tr>
<td>UserName:</td><td><input type ="text" name ="userName"/></td>
</tr>
<tr>
<td>Password:</td><td><input type ="password" name ="password"/></td>
</tr>
<tr>
<td>Confirm-Password:</td><td><input type ="password" name ="password"/></td>
</tr>

<tr>
<td>Email Id:</td><td><input type ="text" name ="email"/></td>
</tr>

<tr>
<td>Contact Number:</td><td><input type ="number" name ="cNumber"/></td>
</tr>
<tr>
<td>Date O f Birth:</td><td><input type ="number" name ="dOb"/></td>
</tr>

<tr>
<td><input type ="submit" name ="submit" value ="Register"/></td><td></td>
</tr>
</table>
</form> 
</body>
</html>