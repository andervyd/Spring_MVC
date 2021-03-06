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

            <form:form action="show-details" modelAttribute="employees" method="get">  <%-- method = get/post --%>

                <div class="form">
                    <label class="label">First name:</label>
                    <form:input type="text" path="firstName" class="input" placeholder="your first name"/>
                    <form:errors path="firstName" cssClass="error"/>
                </div>

                <div class="form">
                    <label class="label">Last name:*</label>
                    <form:input type="text" path="lastName" class="input" placeholder="your last name"/>
                    <form:errors path="lastName" cssClass="error"/>
                </div>

                <div class="form">
                    <label class="label">Phone number:</label>
                    <form:input type="text" path="phoneNumber" class="input" placeholder="your phone number: xxx-xx-xx"/>
                    <form:errors path="phoneNumber" cssClass="error"/>
                </div>

                <div class="form">
                    <label class="label">Email:</label>
                    <form:input type="text" path="email" class="input" placeholder="your email"/>
                    <form:errors path="email" cssClass="error"/>
                </div>

                <div class="form">
                    <label class="label">Salary:</label>
                    <form:input type="text" path="salary" class="input"/>
                    <form:errors path="salary" cssClass="error"/>
                </div>

                <div class="form">
                    <label class="label">Department:</label>
                    <form:select class="select" path="department">
<%--                        <form:options items="${employees.departments}"/> when chouse HashMap with selected--%>
                        <option selected disabled>--Please choose an option--</option>
                        <form:option value="Information Technology">IT</form:option>
                        <form:option value="Human Resources">HR</form:option>
                        <form:option value="Sales">Sales</form:option>
                    </form:select>
                </div>

                <div class="form">
                    <label class="label">Knowledge of layout?</label>
<br/>
                <div class="form">
                    <label class="text">yes</label>
                       <form:radiobutton path="layout" value="yes"/>
                    <label class="text">no</label>
                        <form:radiobutton path="layout" value="no"/>
                </div>
                </div>

                <div class="form">
                    <label class="label">Foreign language(s)</label>
                    <br/>
                    EN <form:checkbox path="languages" value="English"/>
                    DE <form:checkbox path="languages" value="Deutch"/>
                    FR <form:checkbox path="languages" value="French"/>
                </div>

                <input class="btn" type="submit" value="Register"/>

            </form:form>
        </div>
    </div>

</body>
</html>