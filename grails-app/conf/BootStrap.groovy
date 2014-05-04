import com.rentals.users.Role
import com.rentals.users.User
import com.rentals.users.UserRole

class BootStrap {

    def init = { servletContext ->
        User user = new User(username:"admin", password: "admin").save(true)
        Role role = new Role(authority: "ADMIN").save(true)
        UserRole.create(user, role)
    }
    def destroy = {
    }
}
