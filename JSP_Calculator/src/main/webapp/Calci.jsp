<%@page import="Linkcode.model.Calculator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
		<form action="CalculatorController" method="get">
			
				NUMBER 1 :<input type="text" name="no1">
				NUMBER 2 :<input type="text" name="no2">
				<input type="submit" value="add">
				
		</form>
		<%! Calculator cal=null; %>
		<% 
		
		cal=(Calculator)session.getAttribute("Result");
			
			if(cal!=null){
				
				out.println("<h1> ADDITION IS : "+cal.getAdd()+"</h1>");
				
			}
		%>
</body>
</html>