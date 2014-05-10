package com.rentals

class NavigationController {

    def navigationService
    
    def index() {
        
    }
    
    def top() {
        [links: topLinks(), actionList: actionList()] 
    }
	
	def topLinks() {
		def links = []
		links.add(new Link(
			title: 'Home',
			path: g.createLink([uri:'/'])
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
			if(it.path.equals(request.forwardURI)) {
				it.active = true
			}
		}
		links
	}
	
	def actionList() {
		def list = []
		list.add(new Link(
			title: 'Add rent ad',
			path: g.createLink([controller:'rental', action:'create'])
		))
		list
	}
}