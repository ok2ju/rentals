package com.rentals

class Image {
	
	byte[] bytes
	String contentType
	
	static belongsTo = [rental: Rental]
	
	static constraints = {
		bytes(nullable:true, maxSize: 1048576)
		contentType(nullable:true)
	}
	
}
