<%--
  Created by IntelliJ IDEA.
  User: spanov
  Date: 17.01.2025
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>
  Dear employee, you are welcome!!!
</h2>
<br>

<%--Простая реализация, берем просто из формы ask-emp-details-view--%>
<%--Your name : ${param.employeeName}--%>

<%--Берем из Model, которую создали в контроллере--%>
Your name: ${nameAttribute}

</body>
</html>
