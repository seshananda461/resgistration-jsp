<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
      .button {
        background-color: #DCDCDC;
        border: none;
        color: black;
        padding: 5px 10px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        margin: 2px 2px;
        cursor: pointer;
      }
    </style>
</head>
<body>
<form method ="post" action ="login">
<table >
<tr>
<td ><h3>Login Page</h3></td>
<td></td>

</tr>
<tr>
<td>UserName:</td><td><input type ="text" name ="userName"/></td>
</tr>
<tr>
<td>Password:</td><td><input type ="password" name ="password"/></td>
</tr>
<tr>
<td><input type ="submit" name ="submit" value ="login"/></td><td><a href ="register.jsp" class ="button">Registration</a></td>
</tr>
</table>
</form>
</body>
</html>