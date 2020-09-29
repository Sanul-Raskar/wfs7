<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true" import="java.util.Date,java.util.List" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.html" %>

 <%! int i=0; %>
 <h1>Hello Everyone</h1>

	 <jsp:include page="date.jsp">
	 	<jsp:param value="Value1" name="param1"/>
	 	<jsp:param value="Value2" name="param2"/>
	 </jsp:include>
	 
	 <jsp:useBean id="obj" 
	 class="com.hsbc.model.Person" 
	 type="com.hsbc.model.Person" scope="session">
	 </jsp:useBean>
	
	<jsp:setProperty property="name" name="obj" value="Prince"/>
	<jsp:setProperty property="age" name="obj" value="44"/>
	<jsp:setProperty property="address" name="obj" value="Delhi"/>
	
	
	<%=obj %>
	 
	<%--  <jsp:forward page="date.jsp">
	 	<jsp:param value="Value1" name="param1"/>
	 	<jsp:param value="Value2" name="param2"/>
	 
	 </jsp:forward> --%>

 <h3>Counter is  <%= ++i %></h3>
	<%
		application.setAttribute("counter", i);
	%>
	<%
		out.println(application.getAttribute("counter"));
	%>
	${applicationScope.counter}
	<h3>
		Site Counter is
		<%= i %></h3>
	<% 
 	int j=0;
 	if(session.getAttribute("sessionCounter")!=null){
 		j=Integer.parseInt(session.getAttribute("sessionCounter").toString());
 		
 	}
 		j++;
 		session.setAttribute("sessionCounter", j);
  
 %>
	<h3>
		Session Counter is
		<%=j %></h3>
	<%--  <%= 5/0 %> --%>
</body>
</html>