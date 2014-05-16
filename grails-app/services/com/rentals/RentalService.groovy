package com.rentals

import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.users.landlord.Owner

@Transactional
class RentalService {
    
	private static final Log log = LogFactory.getLog(RentalService.class)
	
	def ownerService
	
	def save(Rental rentalInstance) {		
		Owner owner = ownerService.getCurrentUser()
		owner.addToRentals(rentalInstance)
		owner.save(flush:true)
		rentalInstance.save(flush:true)
	}
	
	def addImage(Long rentalId, Image image) {
		Rental rental = Rental.get(rentalId)
		rental.addToImages(new Image(bytes: image.bytes, contentType: image.getContentType()))
		rental.save()
	}
	
}
