package com.rentals.users.landlord

import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Secured("hasAnyRole('PO','BO')")
@Transactional(readOnly = true)
class OwnerController {
	
	private static final Log log = LogFactory.getLog(OwnerController.class)
	
    def ownerService 	
	
    def index() {
        [rentals: ownerService.getCurrentUser().rentals]
    }

    def rentals() {
    	[rentals: ownerService.getCurrentUser().rentals]
    }

}
