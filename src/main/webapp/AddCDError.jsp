<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="it.iftsrizzoli.eserciziofinale.domain.CompactDisc"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VISUALIZZAZIONE DATI CD</title>
<link rel="stylesheet" href="css/layout.css">
</head>
<body>
	<%
		CompactDisc cd = (CompactDisc) request.getAttribute("cd");
	%>
	<div>
		<p>Errore nell'inserimento dei dati relativi a:</p>
	</div>
	<div>
		<p>
			Titolo:
			<%
			String titolo = cd.getTitolo();
			out.println(titolo);
		%><br> Autore:
			<%
			String autore = cd.getAutore();
			out.println(autore);
		%>
		</p>
	</div>
	<div>
		<a class="navigateIn" href="./creaCompactDisc.html">Torna alla pagina di inserimento</a>
	</div>
</body>
</html>