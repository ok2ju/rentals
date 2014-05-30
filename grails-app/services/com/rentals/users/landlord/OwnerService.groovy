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

}
