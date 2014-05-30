package com.rentals.users


import grails.plugin.springsecurity.annotation.Secured;
import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Transactional(readOnly = true)
class EndUserController {
	
	private static final Log log = LogFactory.getLog(EndUserController.class)
	
	def endUserService
	
	@Secured('hasRole("EU")')
	def rentals() {
    	[rentals: endUserService.getCurrentUser().rentals]
    }

    @Secured('hasRole("EU")')
	def leaseAgreements() {
		[leaseAgreements: endUserService.getCurrentUser().leaseAgreements]
	}

	@Secured('permitAll')
    def register() {
		[userInstance: new EndUser()]
	}
	
	@Secured('hasRole("EU")')
	@Transactional
	def save(EndUser userInstance) {
		if (userInstance == null) {
			return
		}
		if (userInstance.hasErrors()) {
			respond(userInstance.errors, view:'register')
			return
		}
		
		endUserService.save(userInstance)
		
		redirect(uri:'/')
	}
}
