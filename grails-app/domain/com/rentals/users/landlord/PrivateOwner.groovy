package com.rentals.users.landlord

import com.rentals.Rental
import com.rentals.users.User

class PrivateOwner extends User {
	
	static hasMany = [rentals : Rental]
	
    String firstname
    String lastname
	
	static constraints = {
		firstname blank: false
		lastname blank: false 
    }
}
