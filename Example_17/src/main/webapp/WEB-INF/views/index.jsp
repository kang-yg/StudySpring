<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>index.jsp</title>
</head>
<body>
	<form action="studentId" method="get">
		student id : <input type="text" name="id"> <br> <input
			type="submit" value="ID전송">
	</form>

	<form action="studentPw" method="post">
		student pw : <input type="text" name="pw"> <br> <input
			type="submit" value="PW전송">
	</form>
</body>
</html>