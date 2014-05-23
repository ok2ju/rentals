package com.rentals.navigation

import com.rentals.Link

abstract class AbstractNavigation {
	
	def g
	
	def abstract getTopLinks(String forwardURI)
	
	def abstract getActions()
	
	protected checkActive(links, String forwardURI) {
		links.each() {
			if(it.path.equals(forwardURI)) {
				it.active = true
			}
		}
		links
	}
	
}
