package com.rentals.util
import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.SpringSecurityService
class RedirectController {

	def SpringSecurityService springSecurityService	
	
    def index() {
		def user = springSecurityService.getCurrentUser()
		
		if(!springSecurityService.isLoggedIn()) {
			redirect(view:"/index")
		} else if(SpringSecurityUtils.ifAnyGranted("PO,BO")) {
			redirect(controller:"landlord")
		}
	}
}
