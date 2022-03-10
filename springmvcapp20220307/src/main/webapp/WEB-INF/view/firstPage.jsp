<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/main.css" />
<title>Spring MVC Demo</title>
</head>
<body>
	<h2>${message}</h2>
	<a href="${pageContext.request.contextPath}/app/hello">Click here...</a>
	<br/>
	<a href="${pageContext.request.contextPath}/app/modelUse">model use</a>
	<br/>
	<a href="${pageContext.request.contextPath}/app/pathVariable">path variables</a>
	<br/>
	<a href="${pageContext.request.contextPath}/app/langage">locale</a>
	<br/>
	<a href="${pageContext.request.contextPath}/app/user">formData</a>
<br/>
	<a href="${pageContext.request.contextPath}/app/user/signup">custom class validation annotation</a>
	<br/>
	<a href="${pageContext.request.contextPath}/app/login">login</a>
	<br/>
	<a href="${pageContext.request.contextPath}/app/login/logout">logout</a>
</body>
</html>