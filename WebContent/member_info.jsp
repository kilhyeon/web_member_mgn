<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리 시스템 관리자모드 (회원 정보 보기)</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<h2>직원 정보</h2>
		<form action="joinProcess" method="get">
			<fieldset>
				<legend>회원 정보</legend>
				<ul>
					<li>
						<label for="id">아이디 : </label>
						<input type="text" name="id" size="20" id="id" value="${member.id }" readonly="readonly">
					</li>
					<li>
						<label for="name">이름 : </label>
						<input type="text" name="name" size="20" value="${member.name }" readonly="readonly">
					</li>
					<li>
						<label for="age">나이 : </label>
						<input type="number" name="title" size="20" value="${member.age }" readonly="readonly">
					</li>
					<li>
						<label for="gender">성별 : </label>
						<input type="text" name="gender" size="20" value="${member.gender }" readonly="readonly">
					</li>
					<li>
						<label for="email">메일 : </label>
						<input type="text" name="email" size="20" value="${member.email }" readonly="readonly">
					</li>
					
					<li>
						<td colspan=2><a href="MemberListServlet">리스트로 돌아가기</a></td>
					</li>
				</ul>
			</fieldset>
		</form>
</body>
</html>