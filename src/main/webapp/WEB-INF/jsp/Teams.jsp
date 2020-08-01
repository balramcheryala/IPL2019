<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/playerlist.css" />" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>About Team</title>
</head>

<body>
	<table border="1" cellpadding="2" width="70%">
		<tr>
			<th>NAME</th>
			<th>COACH</th>
			<th>CAPTAIN</th>
			<th>VENUE</th>
			<th>OWNER</th>
				<tr>
					<td>${team.team_name}</td>
					<td>${team.team_coach}</td>
					<td>${team.team_captain}</td>
					<td>${team.team_home_venue}</td>
					<td>${team.team_owner}</td>

				</tr>
	</table>
	<br />
</body>
</html>