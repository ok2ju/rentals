package com.rentals

import com.rentals.users.landlord.Landlord;

class Rental {
   
    String title
    String type
    Integer rooms = 4
    Double rent = 600.00
    String description
	Address address = new Address()
	
	static embedded = ['address']
	static belongsTo = [landlord: Landlord]
	static hasMany = [images: Image]
	
    static constraints = {
		rooms range : 1..15
		rent range : 0.00..9999.00
		landlord nullable : true
		images(nullable:true)
    }
}
