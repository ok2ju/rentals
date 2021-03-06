package com.rentals.users

import com.rentals.Image

class User {

    transient springSecurityService

    String username
    String password
    boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired
	
	String tel_no
	String address

    Image image

    static transients = ['springSecurityService']

    static constraints = {
        username blank: false, unique: true
        password blank: false
        tel_no nullable: true
		address nullable: true, maxSize: 50
        image nullable: true
    }

    static mapping = { password column: '`password`' }

    Set<Role> getAuthorities() {
        UserRole.findAllByUser(this).collect { it.role } as Set
    }

    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }

    protected void encodePassword() {
        password = springSecurityService.encodePassword(password)
    }
}
