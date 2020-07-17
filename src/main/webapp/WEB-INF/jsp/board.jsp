<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>목록</title>
	</head>
	<body>
		<h1>board</h1>
		<div>
			<table>
				<thead>
					<tr>
						<td>id</td>
						<td>title</td>
						<td>content</td>
						<td>name</td>
					</tr>	
				</thead>
				<tbody>
					<c:forEach var="board" items="${boards}">
						<tr>
							<td><a href="/demo/board/${board.id}">${board.id}</a></td>
							<td>${board.title}</td>
							<td>${board.content}</td>
							<td>${board.name}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<a href="/demo/board/new">글 작성</a>
		</div>
	</body>
</html>