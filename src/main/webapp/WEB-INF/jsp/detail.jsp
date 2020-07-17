<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상세보기</title>
	</head>
	<body>
		<h1>detail</h1>
		<div>
			<input id="id" name="id" value="${board.id }" type="hidden" />
			title: <input id="title" name="title" value="${board.title}"/>
			<br/>
			name: <input id="name" name="name" value="${board.name}"/>
			<br/>
			content: <textarea id="content" name="content" rows="5" cols="10">${board.content}</textarea>
			<br/>
			<input type="button" value="수정" onclick='location.href="/demo/board/${board.id}"'>
            <form:form action="/board/post/${board.bno}" method="DELETE">
          		<input type="submit" value="삭제">
         	</form:form>
		</div>
	</body>
</html>