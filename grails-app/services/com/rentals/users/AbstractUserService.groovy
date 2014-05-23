package com.rentals.users


import grails.plugin.springsecurity.SpringSecurityService
import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import com.rentals.users.UserRole

@Transactional
class AbstractUserService<T> {
	
	private static final Log log = LogFactory.getLog(AbstractUserService.class)
	
	def roleService
	def SpringSecurityService springSecurityService
	
	@Transactional
    def save(userInstance) {
    	if(userInstance == null) {
			log.error("AbstractUserService<$T> - save userInstance is null")
		}
		if(userInstance.validate()) {
			userInstance.save(true)
			Role role = roleService.get(userInstance.ROLE)
			UserRole.create(userInstance, role)
			return userInstance
		} else {
			log.error('AbstractUserService<$T> - save userInstance is not valid')
			userInstance.errors.allErrors.each {
				log.error("it \n")
			}
		}
    }
	
	def getCurrentUser() {
		T.get(springSecurityService.principal.id)
	}
}
