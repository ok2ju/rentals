package com.rentals.users

import com.rentals.Address

class EndUser extends User {
	
	final String ROLE = "EU"
	
    String firstname
    String lastname
    String prefType
    Integer maxRent
	
	static constraints = {
		
	}
}
