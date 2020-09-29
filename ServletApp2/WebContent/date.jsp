<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<p>___________________________</p>
<h2> 
Date coming is    
<%=new java.util.Date() %>
</h2>
<h3>Param1 is <%=request.getParameter("param1") %></h3>
<h3>Param2 is <%=request.getParameter("param2") %></h3>
<p>___________________________</p>
