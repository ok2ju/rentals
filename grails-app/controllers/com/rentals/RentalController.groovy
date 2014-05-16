package com.rentals

import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Transactional(readOnly = true)
class RentalController {

	private static final Log log = LogFactory.getLog(RentalController.class)
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def rentalService
	def ownerService

	@Secured('permitAll')
	def index(Integer max) {
		log.debug("index")
		params.max = Math.min(max ?: 10, 100)
		[rentals: Rental.list(params), count: Rental.count()]
	}

	@Secured('permitAll')
	def show() {
		[rental: Rental.get(params.id)]
	}

	@Secured('hasAnyRole("PO,BO")')
	def create() {
		[rentalInstance: new Rental()]
	}

	@Secured('hasAnyRole("PO,BO")')
	def edit() {
		Rental rentalInstance = landlordService.get(params.id)
		if(rentalInstance == null) {
			redirect(uri:'/notFound')
		}
		[rentalInstance: rentalInstance]
	}

	@Secured('hasAnyRole("PO,BO")')
	def save(Rental rentalInstance) {
		if (rentalInstance == null) {
			return
		}
		if (rentalInstance.hasErrors()) {
			respond(rentalInstance.errors, view:'create')
			return
		}
		rentalService.save(rentalInstance)
		
		render(view: "image", model: [id: rentalInstance.id])
	}

	@Transactional
	@Secured('hasAnyRole("PO,BO")')
	def update(Rental rentalInstance) {
		if (rentalInstance == null) {
			log.debug("update rentalInstance - null")
			return
		}
		if (rentalInstance.hasErrors()) {
			log.debug("update rentalInstance - hasErrors")
			respond rentalInstance.errors, view:'edit'
			return
		}
		rentalInstance.save(flush:true)

		redirect(action: 'show', params: [id: rentalInstance.id])
	}
}
