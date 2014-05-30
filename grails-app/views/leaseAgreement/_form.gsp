<div class="form-group">
	<label>Rent:</label>
	<g:field name="rent" type="number" value="${rental.rent}" required="" class="form-control" placeholder="Rent"/>
	<g:if test="${hasErrors(bean: leaseAgreementInstance, field: 'rent', 'error')}">
		<label class="error-message">${leaseAgreementInstance.error.getFieldError('rent')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Payment method:</label>
	<g:field name="paymentMethod" type="text" value="${leaseAgreementInstance.paymentMethod}" required="" class="form-control" placeholder="Payment method"/>
	<g:if test="${hasErrors(bean: leaseAgreementInstance, field: 'paymentMethod', 'error')}">
		<label class="error-message">${leaseAgreementInstance.error.getFieldError('paymentMethod')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Deposite amount:</label>
	<g:field name="depositeAmount" type="number" value="${leaseAgreementInstance.depositeAmount}" required="" class="form-control" placeholder="Deposite amount"/>
	<g:if test="${hasErrors(bean: leaseAgreementInstance, field: 'depositeAmount', 'error')}">
		<label class="error-message">${leaseAgreementInstance.error.getFieldError('depositeAmount')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Deposite paid:</label>
	<g:checkBox name="depositePaid" value="${leaseAgreementInstance.depositePaid}" class="checkbox"/>
	<g:if test="${hasErrors(bean: leaseAgreementInstance, field: 'depositePaid', 'error')}">
		<label class="error-message">${leaseAgreementInstance.error.getFieldError('depositePaid')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Rent start:</label>
	<g:datePicker name="rentStart" value="${leaseAgreementInstance.rentStart}" noSelection="['':'-Choose-']" class="form-control" placeholder="Rent start"/>
	<g:if test="${hasErrors(bean: leaseAgreementInstance, field: 'rentStart', 'error')}">
		<label class="error-message">${leaseAgreementInstance.error.getFieldError('rentStart')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Rent finish:</label>
	<g:datePicker name="rentFinish" value="${leaseAgreementInstance.rentFinish}" noSelection="['':'-Choose-']" class="form-control" placeholder="Rent finish"/>
	<g:if test="${hasErrors(bean: leaseAgreementInstance, field: 'rentFinish', 'error')}">
		<label class="error-message">${leaseAgreementInstance.error.getFieldError('rentFinish')}</label>
	</g:if>
</div>

<div class="form-group">
	<label>Client:</label>
	<g:select name="client" from="${client}" value="${client.id}" optionKey="id" class="form-control"/>
	<g:if test="${hasErrors(bean: leaseAgreementInstance, field: 'client', 'error')}">
		<label class="error-message">${leaseAgreementInstance.error.getFieldError('client')}</label>
	</g:if>
</div>

<g:hiddenField name="staff" value="${staff.id}" />
<g:hiddenField name="rental" value="${rental.id}" />