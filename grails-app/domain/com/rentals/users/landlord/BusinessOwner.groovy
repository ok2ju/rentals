package com.rentals.users.landlord

import com.rentals.Rental

class BusinessOwner extends Landlord {

	static hasMany = [rentals : Rental]
	
    String bname
    String btype

    static constraints = {
    }
}
