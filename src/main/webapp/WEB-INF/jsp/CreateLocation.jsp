<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
 <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
</head>
<body style="margin:0 auto;
padding: 0 20px 20px 20px;
width:600px;
border:4px solid black;">
<h2>Create Location</h2>

<form action="saveLoc" method="post">
<pre>
Id:   <input type="text" name="id"/>
Code: <input type="text" name="code"/>
Name: <input type="text" name="name"/>
Type: Urban <input type="radio" name="type" value="URBAN"/>
      Rural <input type="radio" name="type" value="RURAL"/>
<input class="btn btn-success" type="submit" value="save  "/>
</pre>
</form>
${msg}
 <td><a class="btn btn-primary" href="displayLocations">All Location</a></td>

</body>
</html>