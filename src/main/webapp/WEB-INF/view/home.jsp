<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>kruehl Company Home Page</title>
</head>

<body>
<h2>
    kruehl Company Home Page
</h2>
<hr>
<p>
    Welcome to the kruehl company home page!
</p>

<hr>

<p>
    User: <security:authentication property="principal.username"/>
    <br><br>
    Role(s): <security:authentication property="principal.authorities"/>
</p>


<hr>


<form:form action="${pageContext.request.contextPath}/logout"
           method="POST">

    <input type="submit" value="Logout">

</form:form>
</body>

</html>