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
	def rentalService

	@Secured('hasRole("ST")')
	def rentals() {
		[
			rentals: staffService.getCurrentUser().rentals,
			panelheading: 'Full rental list.'
		]
	}

	@Secured('hasRole("ST")')
	def actualRentals() {
		render(
			view:'rentals', 
			model: [
				rentals: rentalService.getActualStaffRentalList(staffService.getCurrentId()),
				panelheading: 'Actual rental list.'
			]
		)
	}

	@Secured('hasRole("ST")')
	def leaseAgreements() {
		render(
			view:'/leaseAgreement/list', 
			model:[
				leaseAgreements: staffService.getCurrentUser().leaseAgreements
			]
		)
	}

	@Secured('hasAnyRole("ST,MA")')
	def show() {
		def staff = null
		if(params.id == null) {
			staff = staffService.getCurrentUser()
		} else {
			staff = Staff.get(params.id)
		}
		[userInstance: staff]
	}

    @Secured('hasRole("MA")')
	def list(Integer max) {
		log.debug("index")
		params.max = Math.min(max ?: 10, 100)
		[
			employees: Staff.list(params), 
			panelheading: 'Staff list',
			count: Staff.count()
		]
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

		redirect(
			action: 'show', 
			params: [id: userInstance.id]
		)
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

		redirect(
			action: 'show', 
			params: [id: userInstance.id]
		)
	}

}
