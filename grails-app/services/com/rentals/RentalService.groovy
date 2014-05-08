package com.rentals

import grails.transaction.Transactional

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.users.landlord.PrivateOwner

@Transactional
class RentalService {
    
	private static final Log log = LogFactory.getLog(RentalService.class)
	
    def createRentalsList() {
        def po = createPO()
        Rental r1 = createRental()
        po.addToRentals(r1)
        validate(po)
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
		def address = createAddress()
		Rental r1 = new Rental(
			title:'Rental1',
			type:'Flat',
			rooms:3,
			rent:150,
			description:'Very good deal',
			address: address)
		validate(r1)
	}
	
	def createAddress() {
		def address = new Address(street: 'STREET', area: 'AREA', city: 'CITY', postcode:'2131231')
		validate(address)
	}
	
	def validate(domain) {
		if(!domain.validate()) {
			domain.errors.each {
				log.err(it)
			}
			return null
		} else {
			return domain.save(true)
		}
	}
}
