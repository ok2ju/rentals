<%@ page import="com.rentals.Rental" %>

<div class="form-group">
	<label>Title:</label>
	<g:field name="title" type="text" value="${rentalInstance.title}" required="" class="form-control" placeholder="Title"/>
	<g:if test="${hasErrors(bean: rentalInstance, field: 'title', 'errors')}">
		<label class="error-message">${rentalInstance.errors.getFieldError('title')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Type:</label>
	<g:select name="type" value="${rentalInstance.type}" optionKey="key" optionValue="value" from="${[[key: 'f', value: 'Flat'],[key: 'h', value: 'House']]}" class="form-control"/>
	<g:if test="${hasErrors(bean: rentalInstance, field: 'type', 'errors')}">
		<label class="error-message">${rentalInstance.errors.getFieldError('type')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Rooms:</label>
	<g:field name="rooms" type="number" value="${rentalInstance.rooms}" required="" class="form-control" placeholder="Rooms"/>
	<g:if test="${hasErrors(bean: rentalInstance, field: 'rooms', 'errors')}">
		<label class="error-message">${rentalInstance.errors.getFieldError('rooms')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Rent:</label>
	<g:field name="rent" type="number" value="${rentalInstance.rent}" required="" class="form-control" placeholder="Rent"/>
	<g:if test="${hasErrors(bean: rentalInstance, field: 'rent', 'errors')}">
		<label class="error-message">${rentalInstance.errors.getFieldError('rent')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Description:</label>
	<g:field name="description" type="text" value="${rentalInstance.description}" required="" class="form-control" placeholder="Description"/>
	<g:if test="${hasErrors(bean: rentalInstance, field: 'description', 'errors')}">
		<label class="error-message">${rentalInstance.errors.getFieldError('description')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Street:</label>
	<g:field name="address.street" type="text" value="${rentalInstance?.address.street}" required="" class="form-control" placeholder="Street"/>
	<g:if test="${hasErrors(bean: rentalInstance, field: 'address.street', 'errors')}">
		<label class="error-message">${rentalInstance.errors.getFieldError('address.street')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Area:</label>
	<g:field name="address.area" type="text" value="${rentalInstance?.address.area}" required="" class="form-control" placeholder="Area"/>
	<g:if test="${hasErrors(bean: rentalInstance, field: 'address.area', 'errors')}">
		<label class="error-message">${rentalInstance.errors.getFieldError('address.area')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>City:</label>
	<g:field name="address.city" type="text" value="${rentalInstance?.address.city}" required="" class="form-control" placeholder="City"/>
	<g:if test="${hasErrors(bean: rentalInstance, field: 'address.city', 'errors')}">
		<label class="error-message">${rentalInstance.errors.getFieldError('address.city')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Postcode:</label>
	<g:field name="address.postcode" type="text" value="${rentalInstance?.address.postcode}" required="" class="form-control" placeholder="Postcode"/>
	<g:if test="${hasErrors(bean: rentalInstance, field: 'address.postcode', 'errors')}">
		<label class="error-message">${rentalInstance.errors.getFieldError('address.postcode')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Branch:</label>
	<g:select name="branch" from="${branches}" value="${branches?.id}" optionKey="id" class="form-control"/>
	<g:if test="${hasErrors(bean: rentalInstance, field: 'branch', 'errors')}">
		<label class="error-message">${rentalInstance.errors.getFieldError('branch')}</label>
	</g:if>
</div>




