package com.rentals

import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.users.landlord.Owner

@Transactional
class RentalService {
    
	private static final Log log = LogFactory.getLog(RentalService.class)
	
	def ownerService
	def springSecurityService

	def get(id) {
		Rental.where({owner.id == springSecurityService.principal.id && id == id}).find()
	}

	def getBranchRentalList(branchId) {
		Rental.where({branch.id == branchId}).find()
	}

	def save(Rental rentalInstance) {
		if(rentalInstance == null) {
			log.error("RentalService - save rentalInstance is null")
		}
		if(!rentalInstance.validate()) {
			log.error("RentalService - save rentalInstance is not valid")
			userInstance.errors.allErrors.each {
				log.error("$it \n")
			}
			return rentalInstance;
		}
		Owner owner = ownerService.getCurrentUser()
		owner.addToRentals(rentalInstance)
		owner.save()
		rentalInstance.save()
	}
	
	def addImage(Long rentalId, Image image) {
		Rental rental = Rental.get(rentalId)
		rental.addToImages(new Image(bytes: image.bytes, contentType: image.getContentType()))
		rental.save()
	}
	
}
