<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>

  <style>
    * {
      margin: 0;
      padding: 0;
    }
    html {
      height: 100%;
    }
    body {
      height: 100%;
    }
    .container {
      height: 100%;
      background-image: linear-gradient(to right, #999999, #330867);
    }
    .login-wrapper {
      background-color: bisque;
      width: 358px;
      height: 588px;
      border-radius: 15px;
      padding: 0 50px;
      position: relative;
      left: 50%;
      top: 50%;
      transform: translate(-50%,-50%);
    }
    .header {
      font-size: 38px;
      font-weight: bold;
      text-align: center;
      line-height: 200px;
    }
    .input-item {
      display: block;
      width: 100%;
      margin-bottom: 20px;
      border: 0;
      padding: 10px;
      border-bottom: 1px solid rgb(128,125,125);
      font-size: 15px;
      outline: none;
    }
    .input-item::placeholder {
      text-transform: uppercase;
    }
    .btn {
      text-align: center;
      padding: 10px;
      width: 100%;
      margin-top: 40px;
      background-image: linear-gradient(to right,#a6c1ee, #fbc2eb);
      color: #fff;
    }
    .msg {
      text-align: center;
      line-height: 88px;
    }
    a {
      text-decoration-line: none;
      color: #abc1ee;
    }
  </style>
</head>
<body>
<div class="container">
  <div class="login-wrapper">
    <form id="login" action="/cangku/loginServlet" method="post">
      <div class="header">登录</div>
      <div id="erroMsg">${login_msg}</div>
      <div class="form-wrapper">
        <input type="text" name="username" placeholder="用户名" class="input-item">
        <input type="password" name="password" placeholder="密码" class="input-item">
        <div class="btn">
          <input type="submit" class="btn" value="登录" >
        </div>
      </div>
      <div class="msg">
        没有账号？
        <a href="#">注册/a>
      </div>
    </form>
  </div>
</div>

</body>
</html>


