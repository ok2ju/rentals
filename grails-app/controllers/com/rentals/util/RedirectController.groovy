package com.rentals.util
import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.SpringSecurityService
import grails.transaction.Transactional;

@Transactional
class RedirectController {

	def SpringSecurityService springSecurityService	
	
    def index() {
		def user = springSecurityService.getCurrentUser()
		
		if(!springSecurityService.isLoggedIn()) {
			redirect(view:"/index")
		} else if(SpringSecurityUtils.ifAnyGranted("PO,BO")) {
			redirect(controller:"owner")
		} else if(SpringSecurityUtils.ifAnyGranted("ME")) {
			redirect(controller:"manager")
		} else if(SpringSecurityUtils.ifAnyGranted("SU")) {
			redirect(controller:"supervisor")
		} else {
			redirect(view:"/index")
		}
	}
}
