package com.rentals

import com.rentals.users.EndUser;

class View {

	Date date
	String comments
	
	static belongsTo = [
		endUser: EndUser
	]
	
	static hasOne = [
		rental: Rental
	]
	
    static constraints = {
    }
	
}
