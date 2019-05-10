<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BIG BIG TITLE</title>
</head>
<body>
<h1>SITE WEB</h1>

<!-- On intègre un formulaire à la page HTML -->
<form id="test" action="MaServlet" method="post">
<div>
<label for="nom">Nom :</label> <input type="text" id="name"
name="loginuser">
</div>
<div>
<label for="prenom">Mot de passe:</label> <input id="text" name="mdpuser" />
</div>
<input type="submit" value="Envoyer">

</form>

</body>
</html>