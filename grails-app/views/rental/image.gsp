<!DOCTYPE html>
<html>
<head>
<meta
    name="layout"
    content="main" />
</head>
<body>
	<div class="container">
        <div class="row">
            <div class="col-md-4">
            </div>
            <div class="col-md-4">
                <h2>Do you want to upload an inmage</h2>
                <p>
	                <a class="btn btn-default" href="<g:createLink controller='image' action='create' params='[id:id]'/>" role="button">
	                	Yes
	               	</a>
	               	<a class="btn btn-default" href="<g:createLink controller='rental' action='show' params='[id:id]'/>" role="button">
	                	No
	               	</a>
               	</p>
            </div>
            <div class="col-md-4">
            </div>
        </div>
    </div>
</body>
</html>