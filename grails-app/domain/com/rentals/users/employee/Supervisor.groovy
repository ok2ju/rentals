package com.rentals.users.employee

/**
 * Supervises staff 
 * @author Aleh_Atsman
 */
class Supervisor extends Employee {
	
	final String ROLE = "SU"
	
	static hasMany = [staff: Staff]
}
