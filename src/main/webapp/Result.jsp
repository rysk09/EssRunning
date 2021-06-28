<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List, model.Data, model.Input" %>
    <% List<Data> dataList = (List<Data>) request.getAttribute("dataList"); %>
    <% Input input = (Input) session.getAttribute("Input"); %>

<!DOCTYPE html>
<htmllang="ja">
<head>
<metacharset="UTF-8">
<title>ランニング距離計算</title>
<metaname="description"content="消費カロリーから走るべき距離を計算します">
 
<linkrel="stylesheet"href="https://unpkg.com/ress/dist/ress.min.css">
<linkhref="style.css"　rel="stylesheet" >
<link href="style.css" rel="stylesheet">
</head>
 
<body>
<style class="container">
body{
    
    background-image: url('img/running.jpg');
}


</style>

<headerclass="page-header">
<h1> <a href="/essRunning/Main"> <img class="logo" src="img/sport_jogging_man.png"/></a></h1>
<p class="header-text"><h1>ESS Running</h1></p>
</header>
<div class="result">
<h1 class="distance">一日走った距離:<%= input.getDist() %>km</h1><br><!--ここにデータはいる-->
<h1 class="distance">総距離:<%= input.getTotalDist() %>km</h1>
<h2 class="distance">今までの記録</h2>
<% for(Data data : dataList) { %>
<p><%= data.getDate() %>:<%= data.getUserId() %>:<%= data.getDist() %></p>
<% } %>
<a class="ranking-button" href="/essRunning/Main"/><h2 class="next"><button value="TOPへ" >TOPへ</button></h2></a>
<!--ランキング画面かユーザー画面に遷移か、未決定-->
</div>
</img>
</body>
 
</html>


<!-- 
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
<a href="/essRunning/Main">TOPへ</a>
</body>
</html>
-->