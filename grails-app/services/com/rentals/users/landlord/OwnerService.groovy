package com.rentals.users.landlord

import grails.plugin.springsecurity.SpringSecurityService
import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.Rental
import com.rentals.users.AbstractUserService

@Transactional
class OwnerService extends AbstractUserService<Owner> {
	
	private static final Log log = LogFactory.getLog(OwnerService.class)
	
    def list() {
		getCurrentUser().rentals
    }
	
	def get(id) {
		Rental.where({landlord.id == springSecurityService.principal.id && id == id}).find()
	}
	
	def getCurrentUser() {
		return Owner.get(springSecurityService.principal.id)
	}
}
