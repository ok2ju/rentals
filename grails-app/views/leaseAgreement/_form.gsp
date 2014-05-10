<%@ page import="com.rentals.LeaseAgreement" %>

<div class="fieldcontain ${hasErrors(bean: leaseAgreementInstance, field: 'depositeAmount', 'error')} required">
	<label for="depositeAmount">
		<g:message code="leaseAgreement.depositeAmount.label" default="Deposite Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="depositeAmount" type="number" value="${leaseAgreementInstance.depositeAmount}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: leaseAgreementInstance, field: 'depositePaid', 'error')} ">
	<label for="depositePaid">
		<g:message code="leaseAgreement.depositePaid.label" default="Deposite Paid" />
		
	</label>
	<g:checkBox name="depositePaid" value="${leaseAgreementInstance?.depositePaid}" />

</div>

<div class="fieldcontain ${hasErrors(bean: leaseAgreementInstance, field: 'duration', 'error')} required">
	<label for="duration">
		<g:message code="leaseAgreement.duration.label" default="Duration" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="duration" type="number" value="${leaseAgreementInstance.duration}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: leaseAgreementInstance, field: 'paymentMethod', 'error')} required">
	<label for="paymentMethod">
		<g:message code="leaseAgreement.paymentMethod.label" default="Payment Method" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="paymentMethod" required="" value="${leaseAgreementInstance?.paymentMethod}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: leaseAgreementInstance, field: 'rent', 'error')} required">
	<label for="rent">
		<g:message code="leaseAgreement.rent.label" default="Rent" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="rent" type="number" value="${leaseAgreementInstance.rent}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: leaseAgreementInstance, field: 'rentFinish', 'error')} required">
	<label for="rentFinish">
		<g:message code="leaseAgreement.rentFinish.label" default="Rent Finish" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="rentFinish" precision="day"  value="${leaseAgreementInstance?.rentFinish}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: leaseAgreementInstance, field: 'rentStart', 'error')} required">
	<label for="rentStart">
		<g:message code="leaseAgreement.rentStart.label" default="Rent Start" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="rentStart" precision="day"  value="${leaseAgreementInstance?.rentStart}"  />

</div>

