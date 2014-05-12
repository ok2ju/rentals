package com.rentals.util


import grails.transaction.Transactional
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Transactional
class NavigationService {
	
	private static final Log log = LogFactory.getLog(NavigationService.class)
	def springSecurityService
	
    def getNavigation() {
		def roles = springSecurityService.getPrincipal().getAuthorities()
		def authorities = []
		for(def role in roles) { 
			authorities.add(role.getAuthority())
		}
	}
	
}
