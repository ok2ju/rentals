package com.rentals

import grails.plugin.springsecurity.annotation.Secured

import com.rentals.users.landlord.Landlord

class RentalController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	
    def rentalService
	def springSecurityService	
    
	@Secured('permitAll')
    def index(Integer max) {
		params.max = Math.min(max ?: 10, 100)
		
        rentalService.createRentalsList()
        [rentals: Rental.list(params), count: Rental.count()]
    }
    
    def show() {
        [rental: Rental.get(params.id)]
    }
    
	@Secured('hasAnyRole("PO,BO")')
	def create() {
		[rental: new Rental(params)]
	}
	
	def save(Rental rentalInstance) {
		if (rentalInstance == null) {
			//notFound()
			return
		}

		if (rentalInstance.hasErrors()) {
			//respond(rentalInstance.errors, view:'create')
			return
		}
		
		Landlord landlord = springSecurityService.getCurrentUser()
		landlord.addToRentals(rentalInstance)
		landlord.save(flush:true)
		rentalInstance.save(flush:true)
	}
	
	@Secured("hasRole('endUser')")
    def rent() {
        
    }
    
}
