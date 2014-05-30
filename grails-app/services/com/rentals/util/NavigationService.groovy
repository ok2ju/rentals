package com.rentals.util


import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.navigation.AbstractNavigation
import com.rentals.navigation.NavigationFactory
import com.rentals.users.Role

@Transactional
class NavigationService {
	
	private static final Log log = LogFactory.getLog(NavigationService.class)
	
	def springSecurityService
	
    def AbstractNavigation getNavigation(g) {
		def roles = springSecurityService.getPrincipal().getAuthorities()
		def role = roles[0]
		NavigationFactory.getNavigation(role.authority, g)
	}
	
}
