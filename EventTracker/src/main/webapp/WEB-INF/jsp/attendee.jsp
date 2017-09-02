<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error {
		color: #ff0000;
	}
	.errorblock {
		color: #000;
		background-color: #ffeeee;
		border: 3px;
		padding: 8px;
		margin: 16px;
	}
</style>
</head>
<body>
	<form:form commandName="attendee">
		<form:errors path="*" cssClass="errorblock" element="div"></form:errors>
		<label for="textInput1">Enter name:</label>
		<form:input path="name" cssErrorClass="error"/>
		<form:errors path="name" cssClass="error"></form:errors>
		<label for="textInput2">Enter name:</label>
		<form:input path="emailAddress" cssErrorClass="error"/>
		<form:errors path="emailAddress" cssClass="error"></form:errors>
		<br/>
		<input type="submit" class="btn" value="Enter Attendee">
	</form:form>
</body>
</html>