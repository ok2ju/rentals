package com.rentals.users.landlord

import com.rentals.Address;
import com.rentals.Rental
import com.rentals.LeaseAgreement
import com.rentals.users.User

class Owner extends User {	
	
	String address
	
	static hasMany = [rentals : Rental]
	
	static constraints = {
		rentals nullable: true
		address nullable: true
	}
}
