<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
            </button>
            <g:link uri="/" class="navbar-brand">Rentals</g:link>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <g:each in="${links}" var="link">
                    <li <g:if test="${link.active}">class="active"</g:if>> 
                    	<a href="${link.path}"> ${link.title} </a>
                    </li>
                </g:each>
            </ul>
            <ul class="nav navbar-nav pull-right name-block">
                <sec:ifNotLoggedIn>
                    <li>
                        <g:link controller='login' action='auth'>Login</g:link>
                    </li>
                </sec:ifNotLoggedIn>
                <sec:ifLoggedIn>
                    <li class="user-name">
                        <a data-toggle="dropdown" href="#" class="dropdown-toggle name-link">
                            <sec:username/>
                            <span class="caret"></span>
                        </a>
                        <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                            <g:each in="${actionList}" var="action">
                                <li>
                                    <i class="ace-icon fa fa-cog"></i>
                                    <a href="${action.path}">
										${action.title} 
									</a>
                                </li>
                            </g:each>
                        </ul>
                    </li>
                </sec:ifLoggedIn>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</div>