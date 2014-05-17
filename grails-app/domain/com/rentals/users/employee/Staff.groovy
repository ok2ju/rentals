package com.rentals.users.employee

import com.rentals.Branch
import com.rentals.LeaseAgreement
import com.rentals.Rental

/**
 * Belongs to branch
 * Organizes lease agreement
 * Manages rents
 *
 * @author Aleh_Atsman
 */
class Staff extends Employee {
	
	final String ROLE = "ST"
	
	static hasMany = [
		rentals : Rental,
		leaseAgreements: LeaseAgreement
	]
	
	static belongsTo = [
		supervisor: Supervisor,
		secretary: Secretary
	]
	
    static constraints = {
		rentals nullable: true
		leaseAgreements nullable: true
		secretary nullable: true
		supervisor nullable: true
    }
}
