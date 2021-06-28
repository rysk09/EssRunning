<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Input" %>
    <% Input input = (Input) session.getAttribute("Input"); %>
    
<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="UTF-8">
    <title>ランニング距離計算</title>
    <meta name="description" content="消費カロリーから走るべき距離を計算します">

    <link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">
    <link href="css/style.css" rel="stylesheet">
  </head>
  
  <body>
    <header class="page-header">
      <h1><a href="user.html"><img class="logo" src="img/sport_jogging_man.png" alt="ESS Running"></a></h1>
      <p class="header-text">ESS Running</p>
    </header>
    <div class = tekisei>
        <h1>あなたの摂取カロリーを消費するには・・・<br>
            適正：<%= input.getDist() %>km</h1>　<!--ここにデータ入る-->
    </div>
      
    <div class="tassei">
      <h1>東新宿ESSから<%= input.getLandmark() %>まで<%= input.getLandmarkDist() %>km</h1><br>  <!--ここにデータはいる-->
      <a class="tassei-button" href="Result?rslt=done">達成</a>
      <a class="tassei-button" href="Result">未達成</a>
    </div>
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
<p>適正距離:<%= input.getDist() %></p>
<p>Landmark:<%= input.getLandmark() %></p>
<a href="Result">達成</a>
</body>
</html>
-->