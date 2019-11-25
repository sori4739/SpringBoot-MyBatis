<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "/post/update" method = "POST">
	<input type = "hidden" name = "id" value = "${post.id}">
	<input type = "text" name ="title" value="${post.title}" placeholder = "title"/></br>
	<textarea rows="5" cols="20" name = "content">
	${post.content}
	</textarea>
	<input type = "submit" value="전송"/>
</form>
</body>
</html>