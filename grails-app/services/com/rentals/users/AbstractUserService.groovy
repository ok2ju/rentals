package com.rentals.users


import grails.plugin.springsecurity.SpringSecurityService
import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Transactional
class AbstractUserService<T> {
	
	private static final Log log = LogFactory.getLog(AbstractUserService.class)
	
	def roleService
	def SpringSecurityService springSecurityService
	
	@Transactional
    def save(userInstance) {
		userInstance.save(true)
		Role role = roleService.get(userInstance.ROLE)
		UserRole.create(userInstance, role)
		userInstance
    }
	
	@Transactional
	def getCurrentUser() {
		return T.get(springSecurityService.principal.id)
	}
	
}
