package com.rentals.users.employee

import java.util.Date

import com.rentals.users.Name;
import com.rentals.users.User;

class Employee extends User {

    String firstname
    String lastname
    String sex
    String position
    Date dob

    static constraints = {
    }
}
