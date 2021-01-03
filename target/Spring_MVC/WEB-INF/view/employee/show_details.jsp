<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>

    <meta charset="UTF-8">
    <style><%@include file="/WEB-INF/css/form.css"%></style>
    <title>Show form</title>

</head>
<body>

    <div class="container">

        <div class="title">Your form</div>

            <div class="sub-container">

                    <label class="label">First name:</label>
                    <div class="get-data">${employees.firstName}</div>
                <br/>

                    <label class="label">Last name:</label>
                    <div class="get-data">${employees.lastName}</div>
                <br/>

                    <label class="label">Salary:</label>
                    <div class="get-data">${employees.salary}$</div>
                <br/>

                    <label class="label">Department:</label>
                    <div class="get-data">${employees.department}</div>
                <br/>

                    <label class="label">Knowledge of layout:</label>
                    <div class="get-data">${employees.layout}</div>
                <br/>

                <form class="form">
                <label class="label">Language(s):</label>
                    <c:forEach var="lang" items="${employees.languages}">
                        <div class="list">${lang}</div>
                    </c:forEach>
                </form>
            </div>
    </div>

</body>
</html>