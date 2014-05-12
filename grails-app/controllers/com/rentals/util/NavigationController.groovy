package com.rentals.util

import com.rentals.Link;

class NavigationController {
    
    def top() {
        [links: topLinks(), actionList: actionList()] 
    }
	
	def topLinks() {
		
	}
	
	def actionList() {
		def list = []
		list.add(new Link(
			title: 'Add rent',
			path: g.createLink([controller:'rental', action:'create'])
		))
		list.add(new Link(
			title: 'My rents',
			path: g.createLink([controller:'landlord'])
		))
		list
	}
}