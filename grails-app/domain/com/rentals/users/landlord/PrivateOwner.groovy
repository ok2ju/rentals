package com.rentals.users.landlord

import com.rentals.Rental
import com.rentals.users.User

class PrivateOwner extends Landlord {
	
    String firstname
    String lastname
	
	def addToRentals(arg) {
		super.addToRentals(arg)
	}
	
	static constraints = {
		firstname blank: false
		lastname blank: false 
    }
}
