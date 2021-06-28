<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List, model.Data" %>
    <% List<Data> dataList = (List<Data>) request.getAttribute("dataList"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(Data data : dataList) { %>
<p><%= data.getDate() %>:<%= data.getUserId() %>:<%= data.getDist() %></p>
<% } %>
</body>
</html>