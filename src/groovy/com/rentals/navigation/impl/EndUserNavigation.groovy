package com.rentals.navigation.impl

import com.rentals.Link
import com.rentals.navigation.AbstractNavigation;

class EndUserNavigation extends AbstractNavigation {
	
	@Override
	def getTopLinks(String forwardURI) {
		def links = []
		links.add(new Link(
			title: 'Home',
			path: g.createLink([uri:'/'])
		))
		links.add(new Link(
			title: 'Rentals',
			path: g.createLink(controller:'rental')
		))
		links.add(new Link(
			title: 'About',
			path: g.createLink(uri:'/about')
		))
		links.add(new Link(
			title: 'Contact',
			path: g.createLink(uri:'/contact')
		))
		
		checkActive(links, forwardURI)
	}

	@Override
	def getActions() {
		def list = []
		list.add(new Link(
			title: 'Logout',
			path: g.createLink(uri:'/j_spring_security_logout')
		))
		list
	}

}
