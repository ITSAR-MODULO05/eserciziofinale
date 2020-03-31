<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="it.iftsrizzoli.eserciziofinale.domain.CompactDisc,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/layout.css">
<title>Visualizzazione lista CD</title>
</head>
<body>
<%
		ArrayList<CompactDisc> lista = (ArrayList<CompactDisc>) request.getSession().getAttribute("listacd");
		for (CompactDisc cd : lista) {
			System.out.println(cd.toString());
		}
	%>
	<table>
		<tr>
			<th>Id</th>
			<th>Titolo</th>
			<th>Autore</th>
		</tr>
		<%
			for (int i = 0; i < lista.size(); i++) {
				CompactDisc cd = (CompactDisc) lista.get(i);
		%>
		<tr>
			<td><%=cd.getId()%></td>
			<td><%=cd.getTitolo()%></td>
			<td><%=cd.getAutore()%></td>
		</tr>
		<%
			}
		%>

	</table>

	<div>
		<a class="navigateIn" href="./CreaCompactDisc.html">Torna alla pagina
			di inserimento</a>
	</div>
</body>
</html>