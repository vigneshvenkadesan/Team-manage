<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html>
<head>
	<title>List Players</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
		 
</head>

<body>

	<div id="wrapper">
		<div id="header">
		
		<img src="${pageContext.request.contextPath}/resources/logo.jpg"  height="65" width="70"/>
		
			<h2>CSK Team Management</h2>
		</div>
	</div>
	
	<br>
	<input type="button" value="Add New Player " onclick="window.location.href='showForAdd'; return false" class="add-button" />
		<input type="button" value="Sort by NofMatches" onclick="window.location.href='showSort'; return false" class="add-button" />
	
	<div id="container">
	
		<div id="content">
		
		
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Jersey No</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>PlayerType</th>
					<th>No of Matches</th>
					<th>Runs</th>
					<th>Average</th>
					<th>Best Score</th>
					<th>No of Wickets</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our customers -->
				
				<c:forEach var="tempPlayer" items="${listPlayers}">
				
				<c:url var="updateLink" value="/team/showFormForUpdate">
				<c:param name="PlayerID" value="${tempPlayer.id}" />
				</c:url>
				
				<c:url var="deleteLink" value="/team/showFormForDelete">
				<c:param name="PlayerID" value="${tempPlayer.id}" />
				</c:url>
				
					<tr>
						<td> ${tempPlayer.id} </td>
						<td> ${tempPlayer.firstName} </td>
						<td> ${tempPlayer.lastName} </td>
						<td> ${tempPlayer.playerType} </td>
						<td> ${tempPlayer.no} </td>
						<td> ${tempPlayer.runs} </td>
						<td> ${tempPlayer.avg} </td>
						<td> ${tempPlayer.hScore} </td>
						<td> ${tempPlayer.noW} </td>
						<td> 
						<a href="${updateLink}">Update</a>

						<a href="${deleteLink}">Delete</a>
						</td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









