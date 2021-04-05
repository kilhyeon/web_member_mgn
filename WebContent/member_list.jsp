<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리 시스템 관리자모드 (회원 목록 보기)</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>회원목록</h2>
	<table border="1">
		<thead>
			<tr><td>아이디</td><td>이름</td><td>나이</td><td>성별</td><td>이메일 주소</td><td>비고</td></tr>
		</thead>
		<tbody>
		<c:forEach var="member" items="${list }">
			<tr>
				<td>${member.id }</td>
				<td>${member.name }</td>
				<td>${member.age }</td>
				<td>${member.gender }</td>
				<td>${member.email }</td>
				<td><a href="MemberDeleteServlet">삭제</a></td>
			</tr>
		</c:forEach>	
		</tbody>
			<tfoot>
				<tr><td colspan="6"><a href="main.jsp">돌아가기</a></td></tr>
				<tr><td colspan="6"><a href="joinForm.jsp">회원추가</a></td></tr>
			</tfoot>
	</table>
</body>
</html>