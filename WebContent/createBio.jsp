<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<title>Insert title here</title>
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
			<form action="CreateBio.do" method="GET">
				<input type="hidden" name="id" /> <br> Name: <input
					name="name" /> <br> Like 1: <input name="like1" /> <br>
				Like 2: <input name="like2" /> <br> Like 3: <input
					name="like3" /> <br> Favorite Animal: <input name="animal" />
				<br> Astrological Sign: <select name="sign">
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
				</select> <br> Favorite Quote: <input name="quote" /> <br> <input
					type="submit" /> 
					<input type="hidden" name="image"
					value="http://www.top10zen.com/users/160/780/photos/Jackie_Chan.jpg">

				<%-- <form name="image" action="mailto:youremail@email.com"
					method="post">
					<input type="hidden" name="MAX_FILE_SIZE" value="500" /> <input
						type="file" name="uploadField" />
				</form> --%>



			</form>
		</div>
</body>
</html>