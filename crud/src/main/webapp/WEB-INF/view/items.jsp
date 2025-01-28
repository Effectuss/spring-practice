<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<c:forEach var="item" items="${items}">
    ${item}
    1
    <br>
</c:forEach>
</body>
</html>