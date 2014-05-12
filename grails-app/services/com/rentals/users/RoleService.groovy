package com.rentals.users


import grails.transaction.Transactional
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Transactional
class RoleService {
	
	private static final Log log = LogFactory.getLog(RoleService.class)
	
    def get(String authority) {
		def role = Role.where({authority == authority}).find()
		if(!role) { role = new Role(authority).save(true) }
		role
	}
}
