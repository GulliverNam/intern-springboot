<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>new board</title>
	</head>
	<body>
		<h1> create board!! </h1>
		<form action="/demo/board" method="post">
			title: <input id="title" name="title" />
			<br/>
			name: <input id="name" name="name" />
			<br/>
			content: <textarea id="content" name="content" rows="5" cols="10"></textarea>
			<button type="submit">작성</button>
		</form>
	</body>
</html>