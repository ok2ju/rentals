<html>
<head>
	<meta name='layout' content='main'/>
</head>
<body>
	<div class="container add-rent">
		<div class="row add-rent-row">
			<div class="col-md-6">
				<div class="row">
					<div class="col-md-6">
						<div class="fileupload fileupload-new" data-provides="fileupload">
							<h3>Upload Photo</h3>
							<div class="fileupload-preview thumbnail" style="width: 265px; height: 150px;"></div>
							<div class="upload-menu">
								<span class="btn btn-default btn-file">
									<span class="fileupload-new">
										Select image
									</span>
									<span class="fileupload-exists">
										Change
									</span>
									<g:uploadForm action="save">
										<input type="hidden" name="rentalId" value="${rentalId}"/>
										<input type="file" name="bytes"/>
										<input type="submit" class="btn fileupload-exists" value="Post"/>
									</g:uploadForm>
									<a href="#" class="btn fileupload-exists" data-dismiss="fileupload">Remove</a>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>