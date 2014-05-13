package com.rentals.navigation

import com.rentals.navigation.impl.DefaultNavigation
import com.rentals.navigation.impl.EndUserNavigation
import com.rentals.navigation.impl.LandLordNavigation

class NavigationFactory {
	
	def static AbstractNavigation getNavigation(role, g) {
		def AbstractNavigation result
		switch ( role ) {
			case ["PO", "BO"]:
				result = new LandLordNavigation(g: g)
				break
			case ["EU"]:
				result = new EndUserNavigation(g: g)
			default:
				result = new DefaultNavigation(g: g)
		}
	}
	
}
