
<%@ page import="com.rentals.LeaseAgreement" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'leaseAgreement.label', default: 'LeaseAgreement')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-leaseAgreement" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-leaseAgreement" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="depositeAmount" title="${message(code: 'leaseAgreement.depositeAmount.label', default: 'Deposite Amount')}" />
					
						<g:sortableColumn property="depositePaid" title="${message(code: 'leaseAgreement.depositePaid.label', default: 'Deposite Paid')}" />
					
						<g:sortableColumn property="duration" title="${message(code: 'leaseAgreement.duration.label', default: 'Duration')}" />
					
						<g:sortableColumn property="paymentMethod" title="${message(code: 'leaseAgreement.paymentMethod.label', default: 'Payment Method')}" />
					
						<g:sortableColumn property="rent" title="${message(code: 'leaseAgreement.rent.label', default: 'Rent')}" />
					
						<g:sortableColumn property="rentFinish" title="${message(code: 'leaseAgreement.rentFinish.label', default: 'Rent Finish')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${leaseAgreementInstanceList}" status="i" var="leaseAgreementInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${leaseAgreementInstance.id}">${fieldValue(bean: leaseAgreementInstance, field: "depositeAmount")}</g:link></td>
					
						<td><g:formatBoolean boolean="${leaseAgreementInstance.depositePaid}" /></td>
					
						<td>${fieldValue(bean: leaseAgreementInstance, field: "duration")}</td>
					
						<td>${fieldValue(bean: leaseAgreementInstance, field: "paymentMethod")}</td>
					
						<td>${fieldValue(bean: leaseAgreementInstance, field: "rent")}</td>
					
						<td><g:formatDate date="${leaseAgreementInstance.rentFinish}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${leaseAgreementInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
