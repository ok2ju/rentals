package com.rentals.users.landlord

import grails.plugin.springsecurity.annotation.Secured

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Secured("hasAnyRole('PO','BO')")
class OwnerController {
	
	private static final Log log = LogFactory.getLog(OwnerController.class)
	
    def ownerService 	
	
    def index() {
        [rentals: ownerService.list()]
    }
}
