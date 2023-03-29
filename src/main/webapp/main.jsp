<%--
  Created by IntelliJ IDEA.
  User: blvck
  Date: 3/28/2023
  Time: 6:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<form action="cs?action=register" method="post">
    <div>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" placeholder="Enter your name">
    </div>
    <div>
        <label for="surname">Surname:</label>
        <input type="text" id="surname" name="surname" placeholder="Enter your surname">
    </div>
    <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" placeholder="Enter your password">
    </div>
    <div>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Enter your email">
    </div>
    <div>
        <label>Gender:</label>
        <input type="radio" name="gender" value="male">
        Male
        <input type="radio" name="gender" value="female">
        Female
    </div>
    <div>
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </div>
</form>

</body>
</html>
