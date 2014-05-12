package com.rentals.users

import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;

import com.rentals.users.landlord.Landlord

@Transactional
class LandlordService extends AbstractUserService {
	
	private static final Log log = LogFactory.getLog(LandlordService.class)
	
	def springSecurityService
	
    def list() {
		getLandLord().rentals
    }
	
	def get(id) {
		Rental.where({landlord.id == springSecurityService.principal.id && id == id}).find()
	}
	
	private Landlord getLandLord() {
		return Landlord.get(springSecurityService.principal.id)
	}
}
