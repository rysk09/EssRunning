<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Input" %>
    <% Input input = (Input) session.getAttribute("Input"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>適正距離:<%= input.getDist() %></p>
<p>Landmark:<%= input.getLandmark() %></p>
<a href="Result">達成</a>
</body>
</html>