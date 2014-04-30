package com.rentals.users

class Role {

    String authority

    static mapping = { cache true }

    static constraints = {
        authority blank: false, unique: true
    }
}
