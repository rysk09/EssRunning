<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<title>User Page</title>
</head>

<body>
<!--<p><h1>ECC USER</h1></p>  -->
<link rel="stylesheet" href="css/style.css" type="text/css">
<div  id="logout" align="right"><button value="ログアウト" class="logout" type=“button” onclick="location.href='/essRunning/Logout'">ログアウト</button></div>
<header class="page-header">

<img class="logo" src="img/sport_jogging_man.png" alt="ESS Running">
<h1><a href="User.html"></a></h1>
<p class="header-text">ESS Running</p>
</header>

<!--
    <div class="logout">
</div>
ECC User
</div>
-->

<td style="letter-spacing: 5px;">
<div class="container">
<div class="icon"><button value="ランニング" class="btn" type=“button” onclick="location.href='/essRunning/input.jsp'">ランニング</button>

</div>

<td style="letter-spacing: 5px;">
<div class="icon"><button value="プロフィール" class="btn">プロフィール変更</button>
</div>

<div class="icon" align="right"><button value="データ" class="btn">今までのデータ</button>
</div>


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
<a href="/essRunning/input.jsp">ランニング</a>
</body>
</html>
-->