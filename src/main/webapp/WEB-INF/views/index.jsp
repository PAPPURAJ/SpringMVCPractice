<%@ page import="java.util.List"%>
<%@ page import="database.*"%>

<html>
<body>
<h2>Hello World!</h2>

<%
	
	//for(long   i=0;i<10000000;i++)out.println(i+" ");
%>


<%
	List<RoboticProduct> prod = (List<RoboticProduct>) request.getAttribute("data");
	%>

	<%-- <h1>Hello, myself <%=ff%></h1> --%>

	<%
	for (RoboticProduct fff : prod) {
	%>
	<h1><%=fff%></h1>
	<%
	}
	%>
</body>
</html>
