package com.rentals

import com.rentals.users.landlord.Landlord;

class Rental {
    static belongsTo = [landlord: Landlord]
    
    String title
    String type
    Integer rooms
    Double rent
    String description
	
	Address address

	static embedded = ['address']
	
    static constraints = {
		address nullable: true
    }
}
