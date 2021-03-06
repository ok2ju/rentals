<!DOCTYPE html>
<html>

<head>
    <meta name="layout" content="main" />
</head>

<body>
    <div class="container marketing">
        <div class="row">
            <g:each in="${rentals}" var="rental">
                <div class="col-sm-6 col-md-4 column">
                    <div class="thumbnail">
                        <g:if test="${rental.images[0] != null}">
                            <img data-src="holder.js/100%x180" alt="100%x180" src="<g:createLink controller='image' action='show' params='[id: rental.images[0].id]'/>" style="height: 180px; width: 100%; display: block;">
                        </g:if>
                        <g:else>
                            <img data-src="holder.js/100%x180" alt="100%x180" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxNzEiIGhlaWdodD0iMTgwIj48cmVjdCB3aWR0aD0iMTcxIiBoZWlnaHQ9IjE4MCIgZmlsbD0iI2VlZSI+PC9yZWN0Pjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9Ijg1LjUiIHk9IjkwIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjEycHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+MTcxeDE4MDwvdGV4dD48L3N2Zz4=" style="height: 180px; width: 100%; display: block;">
                        </g:else>
                        <div class="caption">
                            <h3>${rental.title}</h3>
                            <p>${rental.description}</p>
                            <p>
                                <a href="<g:createLink controller="rental" action="show" params="[id:rental.id]"/>" class="btn btn-primary" role="button"> More </a>
                                <a href="<g:createLink controller="rental" action="rent" params="[id:rental.id]"/>" class="btn btn-default" role="button"> Rent </a>
                            </p>
                        </div>
                    </div>
                </div>
            </g:each>
        </div>
    </div>
</body>

</html>
