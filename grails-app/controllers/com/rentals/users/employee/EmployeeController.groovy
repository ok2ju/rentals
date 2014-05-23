package com.rentals.users.employee


import grails.plugin.springsecurity.annotation.Secured

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

class EmployeeController {
	
	private static final Log log = LogFactory.getLog(EmployeeController.class)
	
    def index() { }
	
	@Secured('hasRole("MA")')
	def list(Integer max) {
		log.debug("index")
		params.max = Math.min(max ?: 10, 100)
		[
		   employees: Employee.list(params),
		   panelheading: 'Employes list',
		   count: Employee.count()
	    ]
	}
}
