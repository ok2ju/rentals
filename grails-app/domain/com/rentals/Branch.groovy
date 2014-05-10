package com.rentals

class Branch {

    String tel_no
    String fax_no
	Address address

	static embedded = ['address']
	
    static constraints = {
    }
}
