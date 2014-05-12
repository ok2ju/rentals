package com.rentals.users


import grails.transaction.Transactional
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Transactional
class AbstractUserService {
	
	private static final Log log = LogFactory.getLog(AbstractUserService.class)
	
	def roleService
	
    def save(userInstance) {
		userInstance.save(true)
		Role role = roleService.get(userInstance.ROLE)
		UserRole.create(userInstance, role)
		userInstance
    }
}
