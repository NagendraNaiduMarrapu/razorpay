<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<br><br><br>
<center>
<form onsubmit="return false">
<select>
</select>
<button onclick="decrease()">-</button>
<input type="text" id="count" size="1px"/>
<button onclick="increase()">+</button><br><br><br>
<button>calculate</button><br><br>

<input type="text" placeholder="price" /><br><br>
<input type="button" value="submit"/>
</form>
</center>
</body>

<script>
var count = 0;
function increase(){
	count++;
	document.getElementById("count").value=count;
	
}

function decrease(){
	count--;
	if(count>0){
	document.getElementById("count").value=count;
	}
	
}


$document.ready(function(){
	
})






</script>
</html>
