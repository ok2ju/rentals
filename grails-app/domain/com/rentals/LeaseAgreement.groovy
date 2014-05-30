package com.rentals

import com.rentals.users.employee.Staff
import com.rentals.users.EndUser
import com.rentals.Rental

class LeaseAgreement {

    Double rent
    String paymentMethod
    Integer depositeAmount
    Boolean depositePaid
    Date rentStart
    Date rentFinish

    static belongsTo = [    
        staff: Staff, 
        client: EndUser,
        rental: Rental
    ]

    static constraints = {
    	staff nullable:true
    	client nullable: true
    	rental nullable: true
    }
}
