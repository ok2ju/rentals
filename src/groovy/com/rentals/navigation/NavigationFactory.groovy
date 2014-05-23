package com.rentals.navigation

import com.rentals.navigation.impl.DefaultNavigation
import com.rentals.navigation.impl.EndUserNavigation
import com.rentals.navigation.impl.LandLordNavigation
import com.rentals.navigation.impl.ManagerNavigation

class NavigationFactory {
	
	def static AbstractNavigation getNavigation(role, g) {
		def AbstractNavigation result
		switch ( role ) {
			case ["PO", "BO"]:
				result = new LandLordNavigation(g: g)
				break
			case ["EU"]:
				result = new EndUserNavigation(g: g)
			case ["MA"]:
				result = new ManagerNavigation(g: g)
			default:
				result = new DefaultNavigation(g: g)
		}
	}
	
}
