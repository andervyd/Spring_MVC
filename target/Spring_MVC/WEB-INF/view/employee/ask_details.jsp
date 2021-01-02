<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>

    <meta charset="UTF-8">
    <style><%@include file="/WEB-INF/css/style.css"%></style>
    <title>Data request form</title>

</head>
<body>

    <div class="container">

        <div class="title">Create form</div>

        <div class="sub-container">

            <form:form action="show-details" modelAttribute="employees">

                <div class="form">
                    <label class="label">First name:</label>
                    <form:input type="text" path="firstName" class="input" placeholder="your first name"/>


                <div class="form">
                    <label class="label">Last name:</label>
                    <form:input type="text" path="lastName" class="input" placeholder="your last name"/>

                <div class="form">
                    <label class="label">Salary:</label>
                    <form:input type="text" path="salary" class="input"/>

                <input class="btn" type="submit" value="Register"/>

            </form:form>
        </div>
    </div>

</body>
</html>
