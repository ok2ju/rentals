<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Rentals</title>
    </head>
    <body>
        <!-- Main jumbotron for a primary marketing message or call to action -->
        <div class="jumbotron" style="margin-top: 100px">
            <div class="container">
                <h1>Rentals</h1>
                <p>В этом учебном проекте описана работа компании, которая оказанием услуг в сфере недвижимости. Компания предлагает услуги владельцам, которые хотят
                сдать в аренду свою недвижимость. Предполагаемые услуги включают рекламу недвижимости, опрос арендаторов, организация просмотра сдаваемых в аренду
                объектов потенциальными арендаторами и составление договоров на аренду.</p>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <h2>End user</h2>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                    <p><a class="btn btn-default" href="<g:createLink controller='endUser' action='register'/>" role="button">Register as end user »</a></p>
                </div>
                <div class="col-md-4">
                    <h2>Private Owner</h2>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                    <p><a class="btn btn-default" href="<g:createLink controller='privateOwner' action='register'/>" role="button">Register as Private Owner »</a></p>
                </div>
                <div class="col-md-4">
                    <h2>Buisness Owner</h2>
                    <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                    <p><a class="btn btn-default" href="<g:createLink controller='buisnessOwner' action='register'/>" role="button">Register as Buisness Owner »</a></p>
                </div>
            </div>
            <hr>
            <footer>
                <p>© Rentals 2014</p>
            </footer>
        </div>
    </body>
</html>