package com.rentals

import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.users.landlord.Owner

@Transactional
class RentalService {

	private static final Log log = LogFactory.getLog(RentalService.class)

	def ownerService
	def staffService
	def userService

	def get(id) {
		Rental.where({owner.id == userService.getCurrentId() && id == id}).find()
	}

	def actualList(params) {
		def r1 = Rental.createCriteria().list {
			sizeEq("leaseAgreements", 0)
		}

		def r2 = Rental.createCriteria().list {
			not {
				leaseAgreements {
					gt("rentFinish", new Date())
				}
			}
		}
		r1.addAll(r2)
		r1
	}

	def getBranchRentalList(id) {
		Rental.where({branch.id == id}).find()
	}

	def getStaffRentalList(id) {
		Rental.where({staff.id == id}).find()
	}

	def getActualStaffRentalList(id) {
		def r1 = Rental.createCriteria().list {
			eq("staff.id", id)
			sizeEq("leaseAgreements", 0)
		}

		def r2 = Rental.createCriteria().list {
			eq("staff.id", id)
			not {
				leaseAgreements {
					gt("rentFinish", new Date())
				}
			}
		}
		r1.addAll(r2)
		r1
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

		def owner = ownerService.getCurrentUser()
		owner.addToRentals(rentalInstance)
		owner.save()

		def staff = staffService.findFree(rentalInstance.branch.id)
		staff.addToRentals(rentalInstance)
		staff.save()
		
		rentalInstance.save()
	}

	def addImage(Long rentalId, Image image) {
		Rental rental = Rental.get(rentalId)
		rental.addToImages(new Image(bytes: image.bytes, contentType: image.getContentType()))
		rental.save()
	}

}
