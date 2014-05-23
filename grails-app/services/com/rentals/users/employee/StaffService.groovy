package com.rentals.users.employee

 
import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.Branch
import com.rentals.users.AbstractUserService

@Transactional
class StaffService extends AbstractUserService<Staff> {
	
	private static final Log log = LogFactory.getLog(StaffService.class)
	
}
