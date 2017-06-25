<jsp:include page="header.html" />

<p>
	<%= request.getParameter("name") %>
	<%= request.getParameter("email") %>
</p>

<jsp:include page="footer.html"/>