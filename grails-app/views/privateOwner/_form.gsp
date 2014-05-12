<%@ page import="com.rentals.users.EndUser" %>

<g:field name="username" type="text" value="${userInstance.username}" required="" class="form-control" placeholder="Username"/>
<g:field name="password" type="text" value="${userInstance.password}" required="" class="form-control" placeholder="Password"/>
<g:field name="firstname" type="text" value="${userInstance.firstname}" required="" class="form-control" placeholder="Firstname"/>
<g:field name="lastname" type="text" value="${userInstance.lastname}" required="" class="form-control" placeholder="Lastname"/>