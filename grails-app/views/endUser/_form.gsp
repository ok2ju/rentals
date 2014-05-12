<%@ page import="com.rentals.users.EndUser" %>

<g:field name="username" type="text" value="${userInstance.username}" required="" class="form-control" placeholder="Username"/>
<g:field name="password" type="text" value="${userInstance.password}" required="" class="form-control" placeholder="Password"/>
<g:field name="firstname" type="text" value="${userInstance.firstname}" required="" class="form-control" placeholder="Firstname"/>
<g:field name="lastname" type="text" value="${userInstance.lastname}" required="" class="form-control" placeholder="Lastname"/>
<g:field name="prefType" type="text" value="${userInstance.prefType}" required="" class="form-control" placeholder="PrefType"/>
<g:field name="maxRent" type="number" value="${userInstance.maxRent}" required="" class="form-control" placeholder="Max rent"/>