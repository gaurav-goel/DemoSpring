<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Address</title>
</head>
<body>

<form:form commandName="address" style="padding:8px">
   <br/>
    <p>
        First Line<br/>
        <form:input path="firstLine"/>
    </p>
    <p>
        Last Line<br/>
        <form:input path="lastLine"/>
    </p>
    <input type="submit" value="Save"/>
</form:form>
</body>
</html>