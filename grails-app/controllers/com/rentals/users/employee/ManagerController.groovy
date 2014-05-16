package com.rentals.users.employee


import grails.plugin.springsecurity.annotation.Secured;
import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Secured('hasRole("MA")')
class ManagerController {
	
	private static final Log log = LogFactory.getLog(ManagerController.class)
	
    def index() {
		
	}
}
