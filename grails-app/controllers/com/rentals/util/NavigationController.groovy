package com.rentals.util

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.rentals.Link;
import com.rentals.navigation.AbstractNavigation;

class NavigationController {
    
	private static final Log log = LogFactory.getLog(NavigationController.class)

	def navigationService
	
    def top() {
    	log.debug("Create top navigation")
		AbstractNavigation abstractNavigation = navigationService.getNavigation(g)
        [links: abstractNavigation.getTopLinks(request.forwardURI), actionList: abstractNavigation.getActions()] 
    }
}