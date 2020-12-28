<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>

    <meta charset="UTF-8">
    <style><%@include file="/WEB-INF/css/style.css"%></style>
    <title>Data request form</title>

</head>
<body>

    <h4>Enter your detais:</h4>

    <div class="container">
        <form:form action="show-details" modelAttribute="employees">

            <div class="dws-input">
                Name: <br/> <form:input type="text" path="firstName" />
            </div>
            <div class="dws-input">
                Surname: <br/>  <form:input type="text" path="lastName"/>
            </div>
            <div class="dws-input">
                Salary: <br/>  <form:input type="text" path="salary"/>
            </div>
                <br/>

            <input class="dws-submit" type="submit", value="Submit">

        </form:form>
    </div>

</body>
</html>
