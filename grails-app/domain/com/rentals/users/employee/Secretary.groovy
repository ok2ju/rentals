package com.rentals.users.employee

/**
 * Supports staff
 * @author Aleh_Atsman
 */
class Secretary extends Employee {
	
	final String ROLE = "SE"
	
	static hasMany = [staff: Staff]
}
