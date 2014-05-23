<html>

<head>
    <meta name='layout' content='main' />
</head>

<body>
    <div class="container">
        <asset:image src="houselogo.png" class="logo reg-logo" />
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <g:hasErrors bean="${userInstance}">
            <ul class="errors" role="alert">
                <g:eachError bean="${userInstance}" var="error">
                    <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>>
                        <g:message error="${error}" />
                    </li>
                </g:eachError>
            </ul>
        </g:hasErrors>
        <g:form url="[resource:userInstance, action:'update']" method="PUT" class="form-signin reg-form" role="form">
            <h3>${formHeader}</h3>
            <g:hiddenField name="version" value="${userInstance?.version}" />
            <fieldset class="form">
                <g:render template="/employee/form" />
            </fieldset>
            <fieldset class="buttons">
                <g:submitButton name="update" class="btn btn-lg btn-primary btn-block" value="Update" />
            </fieldset>
        </g:form>
    </div>
</body>

</html>
