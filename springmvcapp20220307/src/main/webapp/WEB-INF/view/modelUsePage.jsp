<!-- 
Il existe en Spring des composant d'interface qu'on peut
utiliser -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
	<form method="post" action="submitModelUse">
		UserName : <input type="text" name="name" /> <br> <br>
		Password : <input type="password" name="pass" /> <br> <br>
		<input type="submit" name="submit">
	</form>
	<a href="${pageContext.request.contextPath}/app/home">HOME</a>
</body>
</html>