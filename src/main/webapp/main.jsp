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
</head>
<body>

<form action="/your-action">
    <div>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" placeholder="Name">
    </div>
    <div>
        <label for="surname">Surname:</label>
        <input type="text" id="surname" name="surname" placeholder="Surname">
    </div>
    <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" placeholder="Password">
    </div>
    <div>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Email">
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>

</body>
</html>
