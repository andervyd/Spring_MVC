<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>

    <meta charset="UTF-8">
    <title>Data request form</title>

</head>
<body>

    <h4>Enter your detais:</h4>

    <form:form action="show-details" modelAttribute="employees">

        Name: <form:input path="firstName"/>
        Surname: <form:input path="lastName"/>
        Salary: <form:input path="salary"/>

        <input type="submit", value="Submit">

    </form:form>

</body>
</html>
