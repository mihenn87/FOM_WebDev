<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="header.html" />


<table>
	<tr>
		<th>dt. Titel</th>
		<th>org. Titel</th>
		<th>V&Ouml;-Datum</th>
		<th>imdbID</th>
	</tr>
	
<c:forEach var="tempMovie" items="${movie_list}">
	<tr>
		<td>${tempMovie.dtTitle}</td>
		<td>${tempMovie.orgTitle}</td>
		<td>${tempMovie.publishDate}</td>
		<td>${tempMovie.imdbId}</td>
	</tr>
</c:forEach>

</table>

<jsp:include page="footer.html" />