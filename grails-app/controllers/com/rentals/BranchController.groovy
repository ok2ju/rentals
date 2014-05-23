package com.rentals


import grails.transaction.Transactional
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Transactional(readOnly = true)
class BranchController {
	
	private static final Log log = LogFactory.getLog(BranchController.class)
	
    def index() { }
    
}
