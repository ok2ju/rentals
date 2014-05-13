package com.rentals.util

import com.rentals.Link;
import com.rentals.navigation.AbstractNavigation;

class NavigationController {
    
	def navigationService
	
    def top() {
		AbstractNavigation abstractNavigation = navigationService.getNavigation(g)
        [links: abstractNavigation.getTopLinks(), actionList: abstractNavigation.getActions()] 
    }
}