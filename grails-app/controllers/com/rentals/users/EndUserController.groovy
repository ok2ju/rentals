package com.rentals.users


import grails.plugin.springsecurity.annotation.Secured;
import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

class EndUserController {
	
	private static final Log log = LogFactory.getLog(EndUserController.class)
	
	def endUserService
	
	@Secured('permitAll')
    def register() {
		[userInstance: new EndUser()]
	}
	
	@Secured('permitAll')
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
