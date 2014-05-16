package com.rentals.navigation.impl

import com.rentals.Link
import com.rentals.navigation.AbstractNavigation

class LandLordNavigation extends AbstractNavigation {

	@Override
	def getTopLinks(String forwardURI) {
		def links = []
		links.add(new Link(
			title: 'Home',
			path: g.createLink([uri:'/'])
		))
		links.add(new Link(
			title: 'My Rentals',
			path: g.createLink(controller:'owner')
		))
		links.add(new Link(
			title: 'About',
			path: g.createLink(uri:'/about')
		))
		links.add(new Link(
			title: 'Contact',
			path: g.createLink(uri:'/contact')
		))
		
		links.each() {
			if(it.path.equals(forwardURI)) {
				it.active = true
			}
		}
		links
	}

	@Override
	def getActions() {
		def list = []
		list.add(new Link(
			title: 'Add rent',
			path: g.createLink([controller:'rental', action:'create'])
		))
		list.add(new Link(
			title: 'My rents',
			path: g.createLink([controller:'owner'])
		))
		list.add(new Link(
			title: 'Logout',
			path: g.createLink(uri:'/j_spring_security_logout')
		))
		list
	}

}
