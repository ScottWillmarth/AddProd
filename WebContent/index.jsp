<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
        
<html>
<head>
<script type="text/javascript">
function empty() 
{
    var x,y,z;
    x = document.getElementById("yourName").value;
    y = document.getElementById("yourColor").value;
    z = document.getElementById("yourPrice").value;
    if (x == "") 
    {
    	alert("Enter a Valid input");
        return false;
    }
    else if (y == "") 
    {
        alert("Enter a Valid input");
        return false;
    }
    if (z == "") 
    {
    	alert("Enter a Valid input");
        return false;
    };
}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add an Animal</title>
</head>
<body>
    <form action="postServlet" method="post">
    Name: <input type="text" name="yourName" id="yourName"> <br><br>
    Color: <input type="text" name="yourColor" id="yourColor"> <br><br>
    Price: <input type="text" name="yourPrice" id="yourPrice"> <br><br>
    <input type="submit" value="Submit" onClick="return empty()"/>
</form>
</body>
</html>