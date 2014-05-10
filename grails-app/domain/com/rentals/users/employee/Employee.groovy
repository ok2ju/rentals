package com.rentals.users.employee

import com.rentals.users.User

class Employee extends User {

    String firstname
    String lastname
    String sex
    String position
    Date dob

    static constraints = {
    }
}
