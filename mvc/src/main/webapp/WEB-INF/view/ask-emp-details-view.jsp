<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Простая форма</title>
</head>
<body>
<h1>Введите данные</h1>
<br>
<%--Реализация без форм spring MVC--%>
<%--<form action="showDetails" method="get">--%>
<%--    <label for="inputField">Ваше значение:</label>--%>
<%--    <input type="text" id="inputField" name="employeeName" placeholder="Введите имя" required>--%>
<%--    <button type="submit">Отправить</button>--%>
<%--</form>--%>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name" cssStyle="color: red"/>

    <br>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname" cssStyle="color: red"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary" cssStyle="color: blueviolet"/>
    <br>
    <br>
    Phone Number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber" cssStyle="color: red"/>
    <br>
    <br>
    Email <form:input path="email"/>
    <form:errors path="email" cssStyle="color: red"/>
    <br>
    <br>
    Department <form:select path="department">

    <form:options items="${employee.departments}"/>

    <%--    Реализация через hard code--%>
    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Human Resources" label="HR"/>--%>
    <%--    <form:option value="Sales" label="Sales"/>--%>
</form:select>
    <br>
    <br>
    Which car do you want?
    <br>
    <br>

    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

    <%--    Реализация через hard code--%>
    <%--    BMV <form:radiobutton path="carBrand" value="BMV"/>--%>
    <%--    Mers <form:radiobutton path="carBrand" value="Mers"/>--%>

    <br>
    <br>

    Foreign Language (s)
    <br>

    <form:checkboxes path="languages" items="${employee.languageList}"/>

    <%--    Вариант реализации hard code--%>
    <%--    EN <form:checkbox path="languages" value="English"/>--%>
    <%--    TUR <form:checkbox path="languages" value="Turckish"/>--%>
    <%--    JPN <form:checkbox path="languages" value="Japan"/>--%>
    <br>
    <br>
    <%--    После нажатия submit, срабатывают все сеттеры для employee--%>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
