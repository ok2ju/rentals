<!DOCTYPE html>
<html>

<head>
    <title>Employee list</title>
    <meta name="layout" content="main" />
</head>

<body>
    <div class="container">
        <div class="panel panel-default promo-panel">
            <div class="panel-heading">${panelheading}</div>
            <div class="panel-body">
                <p>Some default panel content here. Nulla vitae elit libero, a pharetra augue. Aenean lacinia bibendum nulla sed consectetur. Aenean eu leo quam. Pellentesque ornare sem lacinia quam venenatis vestibulum. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            </div>
            <table class="table">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Sex</th>
                        <th>Position</th>
                        <th>DOB</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <g:each in="${employees}" var="employee">
                        <tr>
                            <td>${employee.id}</td>
                            <td>${employee.firstname}</td>
                            <td>${employee.lastname}</td>
                            <td>${employee.sex}</td>
                            <td>${employee.position}</td>
                            <td>${employee.dob}</td>
                            <td><a href="<g:createLink action='show' params='[id:employee.id]'/>">Show</a></td>
                            <td><a href="<g:createLink action='edit' params='[id:employee.id]'/>">Edit</a></td>
                        </tr>
                    </g:each>
                </tbody>
            </table>
        </div>
    </div>
</body>

</html>
