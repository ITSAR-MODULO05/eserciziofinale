<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="it.iftsrizzoli.eserciziofinale.domain.CompactDisc"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/layout.css">
<title>Visualizzazione dati CD</title>
</head>
<body>
	<%
		CompactDisc cd = (CompactDisc)  request.getSession().getAttribute("cd");
	%>
	<table>
		<tr>
			<th>Titolo</th>
			<th>Autore</th>
		</tr>
		<tr>
			<td><%=cd.getTitolo()%></td>
			<td><%=cd.getAutore()%></td>
		</tr>
	</table>
</body>
</html>