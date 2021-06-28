<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "model.User" %>
<% User loginUser = (User) session.getAttribute("loginUser"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カロリーランニング</title>
</head>
<body>
<h1>カロリーランニングログイン</h1>
<%if(loginUser !=null){%>
<p>Login Success</p>
<p>Welcom <%= loginUser.getId() %>さん</p>
<a href="/essRunning/Main">TOPへ</a>
<% }else{ %>
<p>Login false</p>
<a href="/essRunning/index.jsp">TOPへ</a>
<% } %>
</body>
</html>