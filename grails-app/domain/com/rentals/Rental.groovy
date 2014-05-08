package com.rentals

import com.rentals.users.landlord.Landlord;

class Rental {
    static belongsTo = [landlord: Landlord]
    
    String title
    Address address
    String type
    Integer rooms
    Double rent
    String description

    static constraints = {
        landlord nullable:true
    }
}
