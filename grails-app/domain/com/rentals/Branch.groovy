package com.rentals

import com.rentals.users.employee.Employee
import com.rentals.users.employee.Manager

/**
 * Offers rentals
 * Has staff
 * @author Aleh_Atsman
 */
class Branch {

	String tel_no
	String fax_no
	Address address
	Manager manager

	static hasMany = [
		employees : Employee,
		rentals : Rental
	]
	
	static embedded = ['address']

	static constraints = {
		tel_no maxSize: 13
		fax_no maxSize: 13
		employees nullable: true
		rentals nullable: true
	}
}
