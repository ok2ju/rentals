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
                href="#">Rentals</a>
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
        </div>
        <!--/.nav-collapse -->
    </div>
</div>