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
                        <img data-src="holder.js/300x200" alt="300x200" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIzMDAiIGhlaWdodD0iMjAwIj48cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjIwMCIgZmlsbD0iI2VlZSI+PC9yZWN0Pjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9IjE1MCIgeT0iMTAwIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjE5cHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+MzAweDIwMDwvdGV4dD48L3N2Zz4=" style="width: 300px; height: 200px;">
                        <div class="caption">
                            <h3>${rental.title}</h3>
                            <p>${rental.description}</p>
                            <p>
                                <a href="<g:createLink controller=" rental " action="show " params="[id:rental.id] "/>" class="btn btn-primary" role="button"> More </a>
                                <a href="<g:createLink controller=" rental " action="rent " params="[id:rental.id] "/>" class="btn btn-default" role="button"> Rent </a>
                            </p>
                        </div>
                    </div>
                </div>
            </g:each>
        </div>
    </div>
</body>

</html>
