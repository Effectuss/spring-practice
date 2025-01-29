<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <h2>    The interface for work with employees
    </h2>
</head>
<body>
<table>
    <tr>
        <th> Name </th>
        <th> Surname </th>
        <th> Department </th>
        <th> Salary </th>
    </tr>
    <c:forEach var="emp" items="${employeeList}">
        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>