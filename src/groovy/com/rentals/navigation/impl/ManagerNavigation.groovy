package com.rentals.navigation.impl

import com.rentals.Link
import com.rentals.navigation.AbstractNavigation

class ManagerNavigation extends AbstractNavigation {

	@Override
	def getTopLinks(String forwardURI) {
		def links = []
		links.add(new Link(
			title: 'Home',
			path: g.createLink([uri:'/'])
		))
		links.add(new Link(
			title: 'Employee',
			path: g.createLink(controller: 'employee', action: 'list')
		))
		
		checkActive(links, forwardURI)
	}

	@Override
	def getActions() {
		def links = []
		links.add(new Link(
			title: 'Add staff',
			path: g.createLink([controller:'staff', action: 'create'])
		))
		links.add(new Link(
			title: 'Logout',
			path: g.createLink(uri:'/j_spring_security_logout')
		))
		links
	}

}
