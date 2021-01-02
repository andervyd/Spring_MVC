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

            </div>
    </div>

</body>
</html>