<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a new Contact</title>
</head>
<form method="post" action="../rest.todo/rest/addClientRaddclientResource"> 
	<table>
		<tr>
			<th><h2>Enregistrement d'un voyageur</h2></th>
		<tr>
			<td><i>Nom: <input type="text" name="fname" size="15"></i></td>
		</tr>
		<tr>
			<td><i>Prenom: <input type="text" name="lname" size="15"></i></td>
		</tr>
		<tr>
			<td><i>email: <input type="text" name="email" size="15"></i></td>
		</tr>
		<tr>
			<td><i>civilite: <input type="text" name="civilite" size="15"></i></td>
		</tr>
		<tr>
			<td><i>Votre adresse rue: <input type="text" name="rue"
					size="65"></i></td>
		</tr>
		<tr>
			<td><i>ville: <input type="text" name="ville" size="15"></i></td>
		</tr>
		<tr>
			<td><i>code postal: <input type="text" name="codepostal"
					size="15"></i></td>
		</tr>
		<tr>
			<td><i>region: <input type="text" name="region"
					size="15"></i></td>
		</tr>

        <tr>
			<td><i>pays: <input type="text" name="pays"
					size="15"></i></td>
		</tr>
		<tr>
			<td><i>age: <input type="text" name="age"
					size="15"></i></td>
		</tr>
		<tr>
			<td><i>Nr carte indentite: <input type="text" name="nrp"
					size="15"></i></td>
		</tr>
		

		<tr>
			<td><input class="button" type="submit" value="Submit" /><input
				class="button" type="reset" value="Reset"></td>
		</tr>

	</table>
</form>
<body>

</body>
</html>