package com.rentals.users.employee

import grails.plugin.springsecurity.annotation.Secured;
import grails.transaction.Transactional
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import com.rentals.Branch

@Transactional(readOnly = true)
class StaffController {
	
	private static final Log log = LogFactory.getLog(StaffController.class)
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def staffService

	@Secured('hasRole("MA")')
	def show() {
		[userInstance: Staff.get(params.id)]
	}

    @Secured('hasRole("MA")')
	def list(Integer max) {
		log.debug("index")
		params.max = Math.min(max ?: 10, 100)
		render(
			view: "/employee/list", 
		    model: [
				employees: Staff.list(params), 
				panelheading: 'Staff list',
				count: Staff.count()
			]
		)
	}

    @Secured('hasRole("MA")')
    def create() {
		render(
			view: "/employee/create",
			model: [
				formHeader: 'Create staff',
				userInstance: new Staff(), 
				branch: Branch.list()
			]
		)
    }

    @Secured('hasRole("MA")')
    def edit() {
    	Staff userInstance = Staff.get(params.id)
    	render(
			view: "/employee/edit",
			model: [
				formHeader: 'Edit staff',
				userInstance: userInstance, 
				branch: Branch.list()
			]
		)
    }

    @Secured('hasRole("MA")')
	def save(Staff userInstance) {
		if (userInstance == null) {
			return
		}
		if (userInstance.hasErrors()) {
			respond(userInstance.errors, view:'create')
			return
		}
		staffService.save(userInstance)

		redirect(action: 'show', params: [id: userInstance.id])
	}

	@Secured('hasRole("MA")')
	def update(Staff userInstance) {
		if (userInstance == null) {
			return
		}
		if (userInstance.hasErrors()) {
			respond(userInstance.errors, view:'edit')
			return
		}
		staffService.save(userInstance)

		redirect(action: 'show', params: [id: userInstance.id])
	}

}
