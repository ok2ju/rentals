package com.rentals.users

import com.rentals.LeaseAgreement;
import com.rentals.Rental
import com.rentals.View

class EndUser extends User {
	
	final String ROLE = "EU"
	
    String firstname
    String lastname
    String prefType
    Integer maxRent
	
	static hasMany = [
		views: View,
		rentals: Rental,
		leaseAgreements: LeaseAgreement
	]
	
	static constraints = {
		firstname maxSize: 15
		lastname maxSize: 15
		prefType maxSize: 1, nullable: true
		maxRent range: 0.00..9999.00, nullable: true
	}
}
