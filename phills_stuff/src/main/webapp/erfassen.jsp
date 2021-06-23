<%--
  Created by IntelliJ IDEA.
  User: phill
  Date: 22.06.2021
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fahrzeug erfassen</title>
</head>
<body>
<h1>Fahrzeug erfassen</h1>
<form action="/ErfassenServlet" method="get">
    <select>
        <option value="default" selected>Bitte auswählen...</option>
        <option value="neuwagen">Neuwagen</option>
        <option value="oldtimer">Oldtimer</option>
        <option value="youngtimer">Youngtimer</option>
    </select>

</form>

</body>
</html>
