<html>
<head>
	<meta name='layout' content='main'/>
</head>
<body>
	<div class="container marketing">
		<div class="row my-added-rentals">
			<h2>My Added Rentals</h2>
			<hr>
			<g:each in="${rentals}" var="rental">
				<div class="col-xs-6 col-md-3">
					<div class="thumbnail">
						<img data-src="holder.js/100%x180" alt="100%x180" src="data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxNzEiIGhlaWdodD0iMTgwIj48cmVjdCB3aWR0aD0iMTcxIiBoZWlnaHQ9IjE4MCIgZmlsbD0iI2VlZSI+PC9yZWN0Pjx0ZXh0IHRleHQtYW5jaG9yPSJtaWRkbGUiIHg9Ijg1LjUiIHk9IjkwIiBzdHlsZT0iZmlsbDojYWFhO2ZvbnQtd2VpZ2h0OmJvbGQ7Zm9udC1zaXplOjEycHg7Zm9udC1mYW1pbHk6QXJpYWwsSGVsdmV0aWNhLHNhbnMtc2VyaWY7ZG9taW5hbnQtYmFzZWxpbmU6Y2VudHJhbCI+MTcxeDE4MDwvdGV4dD48L3N2Zz4=" style="height: 180px; width: 100%; display: block;">
						<div class="caption">
							<h3>${rental.title}</h3>
                            <p>${rental.description}</p>
							<p>
								<g:link controller="rental" action="edit" params="[id:rental.id]" class="btn btn-primary" role="button">Edit</g:link>
								<g:link controller="rental" action="show" params="[id:rental.id]" class="btn btn-primary" role="button">More</g:link>
							</p>
						</div>
					</div>
				</div>
			</g:each>
		</div>
	</div>
</body>
</html>