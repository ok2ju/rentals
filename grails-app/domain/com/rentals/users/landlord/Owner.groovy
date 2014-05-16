package com.rentals.users.landlord

import com.rentals.Rental
import com.rentals.users.User

class Owner extends User {	
	static hasMany = [rentals : Rental]
}
