package com.rentals.users.employee


import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.users.AbstractUserService

@Transactional
class ManagerService extends AbstractUserService<Manager> {
	
	private static final Log log = LogFactory.getLog(ManagerService.class)
	
}
