<div
    class="navbar navbar-inverse navbar-fixed-top"
    role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button
                type="button"
                class="navbar-toggle"
                data-toggle="collapse"
                data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a
                class="navbar-brand"
                href="#">
                Rentals
            </a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <g:each in="${links}" var="link">
                    <li <g:if test="${link.active}">class="active"</g:if>>
                        <a href="${link.path}">
                            ${link.title}
                        </a>
                    </li>
                </g:each>
            </ul>
			<ul class="nav navbar-nav pull-right name-block">
				<li class="dropdown">
	              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><sec:username/><b class="caret"></b></a>
	              <ul class="dropdown-menu" style="background-color: #3971af;border-color: #2c5889;">
	              	<g:each in="${actionList}" var="action">
	                	<li><a href="${action.path}">${action.title}</a></li>
	                </g:each>
	                <li class="divider"></li>
	                <li class="dropdown-header">Nav header</li>
	                <li><a href="#">Separated link</a></li>
	                <li><a href="/j_spring_security_logout">Log out</a></li>
	              </ul>
	            </li>
			</ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</div>