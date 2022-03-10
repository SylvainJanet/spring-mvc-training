<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>

<title>Spring MVC Demo</title>
</head>

<body>

	<h2>User Data - ${user.getId()} - ${user.getName()}</h2>

	<form:form action="${pageContext.request.contextPath}/app/user/addUser"
		method="POST" modelAttribute="user">

		<form:label path="name">Name</form:label>
		<form:input path="name" />
		<form:errors path="name" cssClass="nameError"/>

		<br>
		<br>

		<form:label path="id">Id</form:label>
		<form:input path="id" />
		<form:errors path="id" cssClass="idError" />

		<br>
		<input type="submit" value="Submit" />
	</form:form>

	<br>
	<a
		href="${pageContext.request.contextPath}/app/user/show?id=4&name=Feres">Display
		user</a>
	<br>
	<a href="${pageContext.request.contextPath}/app/home">HOME</a>
</body>
</html>