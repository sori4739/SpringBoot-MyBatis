<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
제목 : ${post.title}</br>
작성자 아이디 : ${post.userId}</br>
내용 : ${post.content}</br>
<a href = "/post/updateForm/${post.id}" >수정</a>
<a href = "/post/delete/${post.id}">삭제</a>

</body>
</html>