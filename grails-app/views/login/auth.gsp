<html>
<head>
<meta name='layout' content='main'/>
<title><g:message code="springSecurity.login.title"/></title>
</head>
<body>
<div class="container">
	<asset:image src="houselogo.png" class="logo"/>
	<form action="${postUrl}" method="post" class="form-signin" role="form">
		<div class="center-block">
			<g:message code="springSecurity.login.header"/>
		</div>
		<g:if test='${flash.message}'>
			<div class="center-block">
				 ${flash.message}
			</div>
		</g:if>
		<h3>Sign In</h3>
		<input type="username" name='j_username' id='username' class="form-control" placeholder="Username" required="" autofocus=""/>
		<input type="password" name='j_password' id='password' class="form-control" placeholder="Password" required=""/>
		<input type='checkbox' class='chk' name='${rememberMeParameter}' id='remember_me' <g:if test='${hasCookie}'>checked='checked'</g:if> />
		<label for='remember_me'>
			<g:message code="springSecurity.login.remember.me.label"/>
		</label>
		<input class="btn btn-lg btn-primary btn-block" type='submit' value='${message(code: "springSecurity.login.button")}'/>
	</form>
</div>
<script type='text/javascript'>
	<!--
		(function() {
			document.forms['loginForm'].elements['j_username'].focus();
		})();
	// -->
	</script>
</body>
</html>