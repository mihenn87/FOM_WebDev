<%@ page import="java.util.*" %>
<jsp:include page="header.html" />

<!--  Step 1: Create Formular -->
	<form action="todo-demo.jsp">
		Add new item: <input type="text" name="theItem" required />
		<input type="submit" value="Submit" />
	</form>
	
	<br>
	Item entered: <%= request.getParameter("theItem") %>


<!--  Step 2: Create Listing -->
	<%
		// get items from session
		List<String> items = (List<String>) session.getAttribute("myToDoList");
		// if not existing, create new one
		if (items == null){
			items = new ArrayList<String>();
			session.setAttribute("myToDoList",items);
		}
		//
		String theItem=request.getParameter("theItem");
		if (theItem!=null){
			items.add(theItem);
		}
	
	%>
	

<!--  Step 3: Show List -->
<hr>
To List Items: <br/>
<ol>
<%
	for(String temp:items){
		out.println("<li>" + temp + "</li>");
	}
%>
</ol>

<jsp:include page="footer.html"/>