package com.rentals.users.employee

import com.rentals.Branch
import com.rentals.users.User

class Employee extends User {
	
	String firstname
	String lastname
	String sex
	String position
	Date dob
	
	static belongsTo = [branch: Branch]
	
	static constraints = {
		firstname maxSize: 15
		lastname maxSize: 15
		sex maxSize: 1
		dob nullable: true
		position maxSize: 20, nullable: true
	}
}
