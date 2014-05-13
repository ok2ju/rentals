package com.rentals.users.landlord


import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.users.landlord.PrivateOwner;

class PrivateOwnerController {
	
	private static final Log log = LogFactory.getLog(PrivateOwnerController.class)
	
	def privateOwnerService
	
	@Secured('permitAll')
	def register() {
		[userInstance: new PrivateOwner()]
	}
	
	@Secured('permitAll')
	@Transactional
	def save(PrivateOwner userInstance) {
		if (userInstance == null) {
			return
		}
		if (userInstance.hasErrors()) {
			respond(userInstance.errors, view:'register')
			return
		}
		privateOwnerService.save(userInstance)
		redirect(uri:'/')
	}
}
