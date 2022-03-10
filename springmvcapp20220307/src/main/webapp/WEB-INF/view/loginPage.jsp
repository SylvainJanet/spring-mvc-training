<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<h2>${message}</h2>

<form:form action="${pageContext.request.contextPath}/app/login"
	modelAttribute="loginForm" method="POST">

	<form:label path="username">Name</form:label>
	<form:input path="username" />
	<form:errors path="username" cssClass="error" />
	<br>
	<br>
	<form:label path="password">Password</form:label>
	<form:input type="password" path="password" />
	<form:errors path="password" cssClass="error" />
	<br>
	<br>
	<form:hidden path="redirect"/>
	<input type="submit" value="Submit" />
</form:form>
<br>
<a href="${pageContext.request.contextPath}/app/home">HOME</a>
</html>