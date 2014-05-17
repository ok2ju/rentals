<!DOCTYPE html>
<html>

<head>
    <meta name="layout" content="main" />
</head>

<body>
    <div class="container more-info">
        <div class="row featurette">
            <div class="col-md-5">
                <g:if test="${rental.images[0] != null}">
                    <img class="featurette-image img-responsive" data-src="holder.js/500x500/auto" alt="500x500" 
                            src="<g:createLink controller='image' action='show' params='[id: rental.images[0].id]'/>">
                </g:if>
                <g:else>
                    <img data-src="holder.js/300x200" alt="300x200" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIzMDAiIGhlaWdodD0iMjAwIj48cmVjdCB3aWR0aD0iMzAwIiBoZWlnaHQ9IjIwMCIgZmlsbD0iI2VlZSI+PC9yZWN0Pjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9IjE1MCIgeT0iMTAwIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjE5cHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+MzAweDIwMDwvdGV4dD48L3N2Zz4=" style="width: 300px; height: 200px;">
                </g:else>
            </div>
            <div class="col-md-7">
                <h2 class="featurette-heading">
                    ${rental.title}
                </h2>
                <p class="lead">
                    ${rental.description}
                </p>
                ${rental.address.street}
                <div class="row">
                    <g:each var="i" in="${ (1..<rental.images.size())}">
                        <g:if test="${rental.images[i]}">
                            <div class="col-xs-6 col-md-5">
                                <img src="<g:createLink controller='image' action='show' params='[id: rental.images[i].id]'/>" />
                            </div>
                        </g:if>
                    </g:each>
                </div>
                <div class="row order-buttons">
                    <div class="col-md-5">
                        <button class="btn btn-lg btn-primary btn-block" type="submit">Order this</button>
                    </div>
                    <div class="col-md-5">
                        <button class="btn btn-lg btn-primary btn-block" type="submit">Make an inspection</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="row comments">
            <p>
                <h2>Comments</h2>
            </p>
            <div class="media">
                <a class="pull-left" href="#">
                    <img class="media-object" data-src="holder.js/64x64" alt="64x64" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI2NCIgaGVpZ2h0PSI2NCI+PHJlY3Qgd2lkdGg9IjY0IiBoZWlnaHQ9IjY0IiBmaWxsPSIjZWVlIj48L3JlY3Q+PHRleHQgdGV4dC1hbmNob3I9Im1pZGRsZSIgeD0iMzIiIHk9IjMyIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjEycHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+NjR4NjQ8L3RleHQ+PC9zdmc+" style="width: 64px; height: 64px;">
                </a>
                <div class="media-body">
                    <h4 class="media-heading">Media heading</h4>
                    Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
                </div>
            </div>
        </div>
    </div>
</body>

</html>
