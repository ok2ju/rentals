import com.rentals.users.Role
import com.rentals.users.User
import com.rentals.users.UserRole
import com.rentals.users.landlord.PrivateOwner

class BootStrap {

    def init = { servletContext ->
        User user = new User(username:"admin", password: "admin").save(true)
        Role roleAdmin = new Role(authority: "ADMIN").save(true)
        UserRole.create(user, roleAdmin)
		
		PrivateOwner po = new PrivateOwner(firstname:"firstname", lastname:"lastname", username:"privateowner", password:"privateowner").save(true)
		Role rolePO = new Role(authority: "PO").save(true)
		UserRole.create(po, rolePO)		
    }
    def destroy = {
    }
}
