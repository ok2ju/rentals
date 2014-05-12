package com.rentals.users

import grails.plugin.springsecurity.annotation.Secured

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.Rental

@Secured("hasAnyRole('PO','BO')")
class LandlordController {
	
	private static final Log log = LogFactory.getLog(LandlordController.class)
	
    def landlordService 	
	
    def index() {
        [rentals: landlordService.list()]
    }
}
