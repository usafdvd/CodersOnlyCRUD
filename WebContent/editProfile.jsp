<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<title>Make Your Profile Better!</title>
</head>
<body>
<div id="container">
		<div id="header">
			<a href="index.html">CodersOn.ly</a>
			<div id="headerInfo">
				<a href="getAllBios.do">View Profiles</a> | <a
					href="createProfile.jsp">Create a Profile</a> | <a href="faq.jsp">FAQ</a>
			</div>
		</div>


<div id="body">
	<form:form action="UpdateBio.do" modelAttribute="profile">
		<form:hidden path="id"/><br>
		Name: <form:input path="name"/><br>
		Like 1: <form:input path="like1"/><br>
		Like 2: <form:input path="like2"/><br>
		Like 3: <form:input path="like3"/><br>
		Favorite Animal: <form:input path="animal"/><br> 
		Astrological Sign: <form:select path="sign">
			<option value="aquarius">Aquarius</option>
			<option value="pisces">Pisces</option>
			<option value="aries">Aries</option>
			<option value="taurus">Taurus</option>
			<option value="gemini">Gemini</option>
			<option value="cancer">Cancer</option>
			<option value="leo">Leo</option>
			<option value="virgo">Virgo</option>
			<option value="libra">Libra</option>
			<option value="scorpio">Scorpio</option>
			<option value="sagittarius">Sagittarius</option>
			<option value="capricorn">Capricorn</option>
		</form:select><br>
		
		Favorite Quote: <form:input path="quote"/>
		<br>
		<input type="submit" name="UpdateBio.do"/>
		
	</form:form>
	</div>
	</div>
</body>
</html>