<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security"  uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<hr>
<h1> Hai !.. Glad to welcome you </h1>
<hr>	
	User<security:authentication property="principal.username"/>
	<br> <br>
	Role<security:authentication property="principal.authorities"/>
<hr>

	<!--<security:authorize access="hasAnyRole('MANAGER','ADMIN')" > -->
	<a href="${pageContext.request.contextPath}/leaders">Only for Leaders</a>
	<!--</security:authorize>-->
	<br>
	<!--<security:authorize access="hasRole('ADMIN')" > -->
	
	<a href="${pageContext.request.contextPath}/admin">Only for Admin</a>
		<!--</security:authorize>-->
	
<hr>
<form:form action="${pageContext.request.contextPath}/logout" method="POST" >
	
	<input type="submit" value="Logout"/>
	
	</form:form>
</body>
</html>