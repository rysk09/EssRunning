<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "servlet.Login" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カロリーランニング</title>
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<body>
    <form action="/essRunning/Login" method="post" class="loginForm">
      <h2>Login</h2>
      <div class="idForm">
        <input type="text" name = "id" class="id" placeholder="ID">
      </div>
      <div class="passForm">
        <input type="password" name = "pass" class="pw" placeholder="PW">
      </div>
      <!---  if(Login.times >1){  --->
      
      <button type="submit" class="btn" onclick="button()">
        LOG IN
      </button>
      <script>
      	let button = () => {
        	alert('login Button !')
        }
      </script>
      <div class="bottomText">
        Don't you have ID? <a href="#">sign up</a>
      </div>
    </form>
  </body>

</body>
</html>