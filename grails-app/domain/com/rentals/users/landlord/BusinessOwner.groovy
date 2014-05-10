package com.rentals.users.landlord

import com.rentals.Rental

class BusinessOwner extends Landlord {
	
    String bname
    String btype

	def addToRentals(arg) {
		super.addToRentals(arg)
	}
	
    static constraints = {
    }
}
