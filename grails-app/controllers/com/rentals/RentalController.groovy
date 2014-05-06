package com.rentals

import com.rentals.Rental

class RentalController {

    def rentalService
        
    def index() {        
        rentalService.createRentalsList()
        [rentals: Rental.list()]
    }
    
    def show() {
        [rental: Rental.get(params.id)]
    }
    
    def rent() {
        
    }
    
}
