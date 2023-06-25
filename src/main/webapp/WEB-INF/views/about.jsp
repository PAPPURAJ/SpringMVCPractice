<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String f = (String) request.getAttribute("name");
	List<String> ff = (List<String>) request.getAttribute("names");
	%>

	<%-- <h1>Hello, myself <%=ff%></h1> --%>

	<%
	for (String fff : ff) {
	%>
	<h1><%=fff%></h1>
	<%
	}
	%>

</body>
</html>