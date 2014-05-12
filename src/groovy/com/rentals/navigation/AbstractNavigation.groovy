package com.rentals.navigation

abstract class AbstractNavigation {
	
	def g
	
	def abstract getTopLinks(String forwardURI)
	
	def abstract getActions()
	
}
