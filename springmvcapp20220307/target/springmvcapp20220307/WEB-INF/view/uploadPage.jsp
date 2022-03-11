<html>
<body>
	<h1>Importer un fichier</h1>
	<form action="${pageContext.request.contextPath}/app/files/upload"
		method="POST" enctype="multipart/form-data">
		<input type="file" name="fileToUpload" accept=".txt"/>	
		<input type="submit" value="upload"/>
	</form>
	<a href="${pageContext.request.contextPath}/app/home">HOME</a>
</body>
</html>