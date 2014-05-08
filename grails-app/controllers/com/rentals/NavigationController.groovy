package com.rentals

class NavigationController {

    def navigationService
    
    def index() {
        
    }
    
    def top() {
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
        
        [links: links]
    }
}

class Link {
    String title
    String path
    String tooltip
    String target
    Boolean active = false
}