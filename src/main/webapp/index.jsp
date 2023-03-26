<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ruslan</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@48,600,0,0"/>
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="login-card-container">
    <div class="login-card">
        <div class="login-card-logo">
            <img src="img/logo.png" alt="logo">
        </div>
        <div class="login-card-header">
            <h1>Sign In</h1>
            <div>Please login to use the platform</div>
        </div>
        <form class="login-card-form">
            <div class="form-item">
                <span class="form-item-icon material-symbols-rounded">mail</span>
                <input type="text" placeholder="Enter Email" id="emailForm" autofocus required>
            </div>
            <div class="form-item">
                <span class="form-item-icon material-symbols-rounded">lock</span>
                <input type="password" placeholder="Enter Password" id="passwordForm" required>
            </div>
            <div class="form-item-other">
                <div class="checkbox">
                    <input type="checkbox" id="rememberMeCheckbox" checked>
                    <label for="rememberMeCheckbox">Remember me</label>
                </div>
                <a href="#">I forgot my password!</a>
            </div>
            <button type="submit">Sign In</button>
        </form>
        <div class="login-card-footer">
            Don't have an account? <a href="#">Create a free account.</a>
        </div>
    </div>
</div>

</body>
</html>