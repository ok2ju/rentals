package com.rentals.users.landlord

import com.rentals.Rental
import com.rentals.users.User

class PrivateOwner extends Owner {
	
	final String ROLE = "PO"
	
    String firstname
    String lastname
	
	def addToRentals(arg) {
		super.addToRentals(arg)
	}

	def addToLeaseAgreements(arg) {
		super.addToLeaseAgreements(arg)
	}
	
	static constraints = {
		firstname blank: false
		lastname blank: false 
    }
}
