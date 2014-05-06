package com.rentals

import grails.transaction.Transactional

@Transactional
class RentalService {

    def createRentalsList() {
        def address = new Address(street: 'STREET', area: 'AREA', city: 'CITY', postcode:'2131231').save()
        new Rental(title:'Rental1', type:'Flat', rooms:3, rent:150, description:'Very good deal', address: address).save()
        new Rental(title:'Rental2', type:'Flat', rooms:3, rent:150, description:'Very good deal', address: address).save()
        new Rental(title:'Rental3', type:'Flat', rooms:3, rent:150, description:'Very good deal', address: address).save()
        new Rental(title:'Rental4', type:'Flat', rooms:3, rent:150, description:'Very good deal', address: address).save()
        new Rental(title:'Rental5', type:'Flat', rooms:3, rent:150, description:'Very good deal', address: address).save()
        new Rental(title:'Rental6', type:'Flat', rooms:3, rent:150, description:'Very good deal', address: address).save()
    }
}
