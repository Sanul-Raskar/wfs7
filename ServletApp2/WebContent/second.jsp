<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h3>Site Counter is <%= application.getAttribute("counter") %></h3>
 <% 
 	int j=0;
 	if(session.getAttribute("sessionCounter")!=null){
 		j=Integer.parseInt(session.getAttribute("sessionCounter").toString());
 		
 	}
 		j++;
 		session.setAttribute("sessionCounter", j);
  	
 %>
 <h3> Session Counter is <%=j %></h3>
 
 <jsp:useBean id="obj" class="com.hsbc.model.Person" scope="session"></jsp:useBean>
<%--  <jsp:getProperty property="name" name="obj"/> --%>
<h3>Person is : ${obj.name} and age is : ${obj.age}</h3>
 </body>
</html>