package com.rentals.users.landlord

import grails.test.mixin.*
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification
import com.rentals.Rental

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestFor(PrivateOwner)
@Mock([Rental, Address])
class PrivateOwnerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Create PO test"() {
		when:"I create po and save him"
			PrivateOwner po = new PrivateOwner(username:"po", password:"po", firstname:"Firstname", lastname:"Lastname").save(true)
		then:"it shouldBe not null"
			po != null
    }
	
	void "Rentals PO test"() {
		when:"I create po and save him"
			PrivateOwner po = new PrivateOwner(username:"po", password:"po", firstname:"Firstname", lastname:"Lastname").save(true)
			po != null
		then:"I create rental and add it to po"
			def address = new Address(street: 'STREET', area: 'AREA', city: 'CITY', postcode:'2131231')
			Rental r1 = new Rental(
				title:'Rental1',
				type:'Flat',
				rooms:3,
				rent:150,
				description:'Very good deal',
				address: address).save()
			po.addToRentals(r1)
			Rental.all.size() != 0
	}
}
