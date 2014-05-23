<!DOCTYPE html>
<html>

<head>
    <meta name="layout" content="main" />
</head>

<body>
    <div class="container add-rent">
        <div class="row add-rent-row">
            <div class="col-md-6">
                <g:form url="[resource:rentalInstance, action:'update']" method="PUT" class="form-signin add-rent-form" role="form">
                    <g:hiddenField name="version" value="${rentalInstance?.version}" />
                    
                    <h3>Add rental</h3>

                    <fieldset class="form">
                        <g:render template="form" />
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
