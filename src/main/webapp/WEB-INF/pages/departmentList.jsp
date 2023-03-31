<%@ page import="java.util.List" %>
<%@ page import="com.javaee.model.Department" %><%--
  Created by IntelliJ IDEA.
  User: blvck
  Date: 3/31/2023
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Department List</title>
</head>
<body>

<% List<Department> departmentList = (List<Department>) request.getAttribute("departmentList"); %>

<table border="1" style="width: 100%">
    <tr>
        <th>Department ID</th>
        <th>Department Name</th>
        <th>Department Location</th>
    </tr>
    <% for (Department department : departmentList) { %>
    <tr>
        <td><%= department.getDepartmentId()%></td>
        <td><%= department.getDepartmentName()%></td>
        <td><%= department.getDepartmentLocation()%></td>
    </tr>
    <% } %>

</table>


</body>
</html>
