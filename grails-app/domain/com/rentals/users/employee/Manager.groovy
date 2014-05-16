package com.rentals.users.employee

import com.rentals.Branch

/**
 * Manages branch
 * @author Aleh_Atsman
 */
class Manager extends Employee {
	
	final String ROLE = "MA"
	
	static hasOne = [branch: Branch]
	
    static constraints = {
		branch nullable: true
    }
}
