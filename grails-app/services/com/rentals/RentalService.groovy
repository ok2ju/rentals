package com.rentals

import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.users.landlord.Landlord

@Transactional
class RentalService {
    
	private static final Log log = LogFactory.getLog(RentalService.class)
	
	def springSecurityService
	
	def save(Rental rentalInstance) {		
		Landlord landlord = Landlord.get(springSecurityService.principal.id)
		landlord.addToRentals(rentalInstance)
		landlord.save(flush:true)
		rentalInstance.save(flush:true)
	}
	
	def addImage(Long rentalId, Image image) {
		Rental rental = Rental.get(rentalId)
		rental.addToImages(new Image(bytes: image.bytes, contentType: image.getContentType()))
		rental.save()
	}
	
}
