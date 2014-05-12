<html>
<head>
	<meta name='layout' content='register'/>
</head>
<body>
	<div class="container">
	      <asset:image src="houselogo.png" class="logo reg-logo"/>
	      <g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
		  </g:if>
		  <g:hasErrors bean="${userInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${userInstance}" var="error">
					<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>>
						<g:message error="${error}"/>
					</li>
				</g:eachError>
			</ul>
		  </g:hasErrors>
		  <g:form url="[resource:userInstance, action:'save']" class="form-signin reg-form" role="form">
            <h3>Registration</h3>
            <fieldset class="form">
				<g:render template="form"/>
			</fieldset>
            <fieldset class="buttons">
				<g:submitButton name="create" class="btn btn-lg btn-primary btn-block" value="Register" />
			</fieldset>
          </g:form>
    </div>
</body>
</html>