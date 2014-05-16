package com.rentals

import com.rentals.users.employee.Staff
import com.rentals.users.landlord.Owner

class Rental {

	String title
	String type
	Integer rooms = 4
	Double rent = 600.00
	String description
	Address address = new Address()

	static embedded = ['address']
	
	static belongsTo = [
		landlord: Owner, 
		branch: Branch, 
		staff: Staff
	]
	
	static hasMany = [images: Image]

	static constraints = {
		rooms range : 1..15
		rent range : 0.00..9999.00
		landlord nullable : true
		images nullable: true
		staff nullable: true
	}
}
