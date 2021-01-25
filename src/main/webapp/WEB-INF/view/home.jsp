<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

<form:form action="${pageContext.request.contextPath}/logout"
           method="POST">

    <input type="submit" value="Logout">

</form:form>
</body>

</html>