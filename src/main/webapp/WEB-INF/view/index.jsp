<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC View Demo</title>
</head>
<body>
<h1>Spring MVC View Demo</h1>
<form:form commandName="user" method="post" action="indexConfirm">
    <div>
        <label for="name">name :</label>
        <form:input path="name" id="name"/>
        <form:errors path="name"/>
    </div>
    <div>
        <label>password :</label>
        <form:password path="password"/>
    </div>
    <div>
        <label>gender :</label>
        <form:radiobutton path="gender" value="male" id="maleRadio"/><label for="maleRadio">male</label>
        <form:radiobutton path="gender" value="female" id="femaleRadio"/><label for="femaleRadio">female</label>
    </div>
    <div>
        <label>channels :</label>
        <form:checkbox path="channels" value="email" id="emailCheckBox"/><label for="emailCheckBox">email</label>
        <form:checkbox path="channels" value="phone" id="phoneCheckBox"/><label for="phoneCheckBox">phone</label>
        <form:checkbox path="channels" value="SMS" id="smsCheckBox"/><label for="smsCheckBox">SMS</label>
    </div>
    <div>
        <label>server: </label>
        <form:select path="server">
            <form:option value="tomcat"/>
            <form:option value="jetty"/>
        </form:select>
    </div>
    <div>
        <label for="agreeCheckBox">Agree :</label><form:checkbox path="agree" id="agreeCheckBox"/>
    </div>
    <input type="submit" value="submit">
</form:form>
</body>
</html>