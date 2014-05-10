
<%@ page import="com.rentals.LeaseAgreement" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'leaseAgreement.label', default: 'LeaseAgreement')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-leaseAgreement" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-leaseAgreement" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list leaseAgreement">
			
				<g:if test="${leaseAgreementInstance?.depositeAmount}">
				<li class="fieldcontain">
					<span id="depositeAmount-label" class="property-label"><g:message code="leaseAgreement.depositeAmount.label" default="Deposite Amount" /></span>
					
						<span class="property-value" aria-labelledby="depositeAmount-label"><g:fieldValue bean="${leaseAgreementInstance}" field="depositeAmount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaseAgreementInstance?.depositePaid}">
				<li class="fieldcontain">
					<span id="depositePaid-label" class="property-label"><g:message code="leaseAgreement.depositePaid.label" default="Deposite Paid" /></span>
					
						<span class="property-value" aria-labelledby="depositePaid-label"><g:formatBoolean boolean="${leaseAgreementInstance?.depositePaid}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaseAgreementInstance?.duration}">
				<li class="fieldcontain">
					<span id="duration-label" class="property-label"><g:message code="leaseAgreement.duration.label" default="Duration" /></span>
					
						<span class="property-value" aria-labelledby="duration-label"><g:fieldValue bean="${leaseAgreementInstance}" field="duration"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaseAgreementInstance?.paymentMethod}">
				<li class="fieldcontain">
					<span id="paymentMethod-label" class="property-label"><g:message code="leaseAgreement.paymentMethod.label" default="Payment Method" /></span>
					
						<span class="property-value" aria-labelledby="paymentMethod-label"><g:fieldValue bean="${leaseAgreementInstance}" field="paymentMethod"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaseAgreementInstance?.rent}">
				<li class="fieldcontain">
					<span id="rent-label" class="property-label"><g:message code="leaseAgreement.rent.label" default="Rent" /></span>
					
						<span class="property-value" aria-labelledby="rent-label"><g:fieldValue bean="${leaseAgreementInstance}" field="rent"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaseAgreementInstance?.rentFinish}">
				<li class="fieldcontain">
					<span id="rentFinish-label" class="property-label"><g:message code="leaseAgreement.rentFinish.label" default="Rent Finish" /></span>
					
						<span class="property-value" aria-labelledby="rentFinish-label"><g:formatDate date="${leaseAgreementInstance?.rentFinish}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaseAgreementInstance?.rentStart}">
				<li class="fieldcontain">
					<span id="rentStart-label" class="property-label"><g:message code="leaseAgreement.rentStart.label" default="Rent Start" /></span>
					
						<span class="property-value" aria-labelledby="rentStart-label"><g:formatDate date="${leaseAgreementInstance?.rentStart}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:leaseAgreementInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${leaseAgreementInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
