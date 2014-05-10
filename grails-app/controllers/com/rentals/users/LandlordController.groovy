package com.rentals.users

import grails.plugin.springsecurity.annotation.Secured

@Secured("hasAnyRole('PO','BO')")
class LandlordController {

    def index() { }
}
