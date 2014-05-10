package com.rentals

import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.users.landlord.PrivateOwner

@Transactional
class RentalService {
    
	private static final Log log = LogFactory.getLog(RentalService.class)
	
	def save(Rental rentalInstance) {
		if (rentalInstance == null) {
			notFound()
			return
		}

		if (rentalInstance.hasErrors()) {
			respond(rentalInstance.errors, view:'create')
			return
		}

		rentalInstance.save(flush:true)
	}
	
    def createRentalsList() {
        def po = createPO()
        Rental r1 = createRental()
        po.addToRentals(r1)
		r1.landlord = po
		po.save()
		Rental r2 = new Rental(
			title:'Rental2',
			type:'Flat',
			rooms:3,
			rent:150,
			description:'Very good deal').save(true)
    }
	
	def createPO() {
		PrivateOwner po = new PrivateOwner(
			firstname: "Oleg",
			lastname: "Atsman",
			username: "po",
			password: "po"
		)
		po
	}
	
	def createRental() {
		Rental r1 = new Rental(
			title:'Rental1',
			type:'Flat',
			rooms:3,
			rent:150,
			description:'Very good deal')
	}
	
	def validate(domain) {
		if(!domain.validate()) {
			domain.errors.each {
				log.err(it)
			}
			return null
		} else {
			return domain
		}
	}
}
