<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Простая форма</title>
</head>
<body>
<h1>Введите данные</h1>
<br>
<form action="showDetails" method="get">
    <label for="inputField">Ваше значение:</label>
    <input type="text" id="inputField" name="employeeName" placeholder="Введите имя" required>
    <button type="submit">Отправить</button>
</form>
</body>
</html>
