<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Location</title>
 <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
</head>
<body style="margin:0 auto;
padding: 0 20px 20px 20px;
width:600px;
border:4px solid black;">
<h2>Update Location</h2>

<form action="updateLoc" method="post">
<pre>
Id:   <input type="text" name="id" value="${location.id}" readonly/>
Code: <input type="text" name="code"value="${location.code}"/>
Name: <input type="text" name="name"value="${location.name}"/>
Type: Urban <input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}/>
      Rural <input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/>
<input class="btn btn-success" type="submit" value="save  "/>
<a class="btn btn-warning" href="displayLocations">Cancel</a>

</pre>
</form>
  
</body>
</html>