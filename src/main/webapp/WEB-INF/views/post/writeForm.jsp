<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "/post/save" method = "POST">
	<input type = "text" name ="title" placeholder = "title"/></br>
	<textarea rows="5" cols="20" name = "content">
	
	</textarea>
	<input type = "submit" value="전송"/>
</form>
</body>
</html>