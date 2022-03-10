<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<body>
	<ul>
	<li><a href="?lang=en"> <fmt:message key="label.lang.en"/></a></li>
	<li><a href="?lang=fr"> <fmt:message key="label.lang.fr"/> </a></li>
	</ul>
	<br>
	<a href="${pageContext.request.contextPath}/app/home">HOME</a>
</body>
</html>