<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
	<h2>Create account</h2>
	<form:form action="${pageContext.request.contextPath}/app/user/createAccount"
	modelAttribute="accountCreation" method="POST">
	
	<form:label path="email">Email</form:label>
	<form:input path="email"/>
	<form:errors path="email" cssClass="error"/>

	<br><br>

	<form:label path="emailCheck">EmailCheck</form:label>
	<form:input path="emailCheck"/>
	<form:errors path="emailCheck" cssClass="error"/>
	
	<br><br>
	
	<form:label path="password">Password</form:label>
	<form:input path="password"/>
	<form:errors path="password" cssClass="error"/>
	
	<br><br>
	
	<form:label path="passwordCheck">PasswordCheck</form:label>
	<form:input path="passwordCheck"/>
	<form:errors path="passwordCheck" cssClass="error"/>
	
	<br><br>
	
	<input type="submit" value="Submit" />
	<br>
	<form:errors cssClass="error"/>
	</form:form>
	<br>
	<a href="${pageContext.request.contextPath}/app/home">HOME</a>
</body>

</html>
