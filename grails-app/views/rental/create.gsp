<!DOCTYPE html>
<html>
<head>
<meta
    name="layout"
    content="main" />
</head>
<body>
    <div class="container add-rent">
      <div class="row add-rent-row">
        <div class="col-md-6">
          <g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
		  </g:if>
		  <g:hasErrors bean="${rentalInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${rentalInstance}" var="error">
					<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>>
						<g:message error="${error}"/>
					</li>
				</g:eachError>
			</ul>
		  </g:hasErrors>
          <g:form url="[resource:rental, action:'save']" class="form-signin add-rent-form" role="form">
          		<h3>Add rental</h3>
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="create" class="btn btn-lg btn-primary btn-block" value="Create" />
				</fieldset>
		  </g:form>
        </div>
      </div>
    </div>
</body>
</html>