<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

        <c:url var="updateButton" value="/updateEmployeeInfo">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td><input type="button" value="Update"
                       onclick="window.location.href = '${updateButton}'">

                <input type="button" value="Delete"
                       onclick="window.location.href = '${deleteButton}'">
            </td>
        </tr>
    </c:forEach>
</table>

<input type="button" value="Add"
       onclick="window.location.href = 'addNewEmployee'">
</body>
</html>