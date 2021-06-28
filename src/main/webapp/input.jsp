<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
  <div class="form-wrapper">
    <h1>距離計算</h1>
    <h2>一食のカロリーを消費することができる距離を表示します</h2>
    <form action="Main" method="post">
      <div class="form-item">
        <label for="calorie"></label>
        摂取カロリー(kcal)<input type="text" name="kcal" required="required"></input>
      </div>
      <div class="form-item">
        <label for="weight"></label>
        体重(kg)&ensp; &ensp; &ensp; &ensp; &ensp; &ensp;<input type="text" name="weight" required="required" ></input>
      </div>
      <div class="button-panel">
        <input type="submit" class="calculation" title="calculation" value="計算"></input>
      </div>
    </form>
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
<form action="Main" method="post">
体重:<input type="text" name="weight">(kg)<br>
摂取カロリー:<input type="text" name="kcal">(kcal)<br>
<input type="submit" value="OK">
</body>
</html>
  -->