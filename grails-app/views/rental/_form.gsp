<%@ page import="com.rentals.Rental" %>

<div class="fieldcontain ${hasErrors(bean: rentalInstance, field: 'depositeAmount', 'error')} required">
	<label for="depositeAmount">
		<g:message code="rental.depositeAmount.label" default="Deposite Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="depositeAmount" type="number" value="${rentalInstance.depositeAmount}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: rentalInstance, field: 'depositePaid', 'error')} ">
	<label for="depositePaid">
		<g:message code="rental.depositePaid.label" default="Deposite Paid" />
		
	</label>
	<g:checkBox name="depositePaid" value="${rentalInstance?.depositePaid}" />

</div>

<div class="fieldcontain ${hasErrors(bean: rentalInstance, field: 'duration', 'error')} required">
	<label for="duration">
		<g:message code="rental.duration.label" default="Duration" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="duration" type="number" value="${rentalInstance.duration}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: rentalInstance, field: 'paymentMethod', 'error')} required">
	<label for="paymentMethod">
		<g:message code="rental.paymentMethod.label" default="Payment Method" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="paymentMethod" required="" value="${rentalInstance?.paymentMethod}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: rentalInstance, field: 'rent', 'error')} required">
	<label for="rent">
		<g:message code="rental.rent.label" default="Rent" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="rent" type="number" value="${rentalInstance.rent}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: rentalInstance, field: 'rentFinish', 'error')} required">
	<label for="rentFinish">
		<g:message code="rental.rentFinish.label" default="Rent Finish" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="rentFinish" precision="day"  value="${rentalInstance?.rentFinish}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: rentalInstance, field: 'rentStart', 'error')} required">
	<label for="rentStart">
		<g:message code="rental.rentStart.label" default="Rent Start" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="rentStart" precision="day"  value="${rentalInstance?.rentStart}"  />

</div>

