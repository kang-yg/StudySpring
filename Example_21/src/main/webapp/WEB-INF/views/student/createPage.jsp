<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	createPage.jsp
	<br />

	<form action="createDonePage">
		�̸� : <input type="text" name="name" vlaue="${student.name }">
		<br> ���̵� : <input type="text" name="id" vlaue="${student.id }">
		<br> <input type="submit" value="����"> <br>
	</form>
</body>
</html>