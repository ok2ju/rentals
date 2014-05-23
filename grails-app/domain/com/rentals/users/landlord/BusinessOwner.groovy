package com.rentals.users.landlord

import com.rentals.Address

class BusinessOwner extends Owner {
	
	final String ROLE = 'BO'
	
    String bname
    String btype
	String contactName
	
	def addToRentals(arg) {
		super.addToRentals(arg)
	}
	
    static constraints = {
    }
}
