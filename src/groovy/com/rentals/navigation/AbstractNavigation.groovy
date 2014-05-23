package com.rentals.navigation

import com.rentals.Link

abstract class AbstractNavigation {
	
	def g
	
	abstract getTopLinks(String forwardURI)
	
	abstract getActions()
	
	protected checkActive(links, String forwardURI) {
		links.each() {
			if(it.path.equals(forwardURI)) {
				it.active = true
			}
		}
		links
	}
	
}
