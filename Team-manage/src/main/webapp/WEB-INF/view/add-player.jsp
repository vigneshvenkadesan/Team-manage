<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>

<head>
	<title>Add Player</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
		  <style>
.error
{color:red}</style>
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>CSK- Team New Entry</h2>
		</div>
	</div>

	<div id="container">
		<h3>Add Player</h3>
	
		<form:form action="savePlayer" modelAttribute="thePlayer" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
					
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>

					<tr>
						<td><label>Type of Player</label></td>
						<td><form:input path="playerType" /></td>
					</tr>
					
					<tr>
						<td><label>No of matches</label></td>
						<td><form:input path="no" /><form:errors path="no" cssClass="error" />
						</td>
					</tr>
					<tr>
						<td><label>Average</label></td>
						<td><form:input path="avg" /></td>
					</tr>
					<tr>
						<td><label>Runs Scored</label></td>
						<td><form:input path="runs" /></td>
					</tr>
					<tr>
						<td><label>Best Score</label></td>
						<td><form:input path="hScore" /></td>
					</tr>
					<tr>
						<td><label>No Of Wickets</label></td>
						<td><form:input path="noW" /></td>
					</tr>
					

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/team/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>










