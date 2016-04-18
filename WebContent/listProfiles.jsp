<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<title>Meet Your Future Dependency Here!</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<a href="index.html">CodersOn.ly</a>
			<div id="headerInfo">
				<a href="getAllBios.do">View Profiles</a> | <a
					href="createBio.jsp">Create a Profile</a>
			</div>
		</div>
		<div id="body">
			<c:forEach var="profile" items="${profiles}">
				<div class="profileCard">
					<c:if test="${! empty(profile)}">
						<div id="profilePic">
						<img src="${profile.image}"></img>
						</div>
						<div id="profileInfo">
							Name: ${profile.name} <br> Likes: ${profile.like1},
							${profile.like2}, and ${profile.like3} <br> Favorite animal:
							${profile.animal} <br> Astrological sign: ${profile.sign} <br>
							Favorite quote: ${profile.quote}<br> <a
								href="EditBio.do?id=${profile.id}"><button type="button"
									name="${profile.id}">Edit Profile</button></a> <a
								href="DeleteBio.do?id=${profile.id}"><button type="button"
									name="${profile.id}">Delete Profile</button></a> <br> <br>
						</div>
					</c:if>
				</div>
			</c:forEach>
		</div>


		<div id="footer">
			<br>
			<table>
				<tbody>
					<tr>
						<td><form action="GetProfileData.do" method="GET">
								Search by Name: <input type="text" name="name" /><input
									type="submit" value="Search" />
							</form></td>
						<td><form action="GetProfileData.do" method="GET">
								Search by Animal: <input type="text" name="animal" /><input
									type="submit" value="Search" />
							</form></td>
						<td><form action="GetProfileData.do" method="GET">
								<select name="sign">
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
								</select> <input type="submit">
							</form></td>
				</tbody>
			</table>
		</div>
	</div>
</body>



</html>