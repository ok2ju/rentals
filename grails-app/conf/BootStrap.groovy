import java.util.regex.Pattern.Branch

import com.rentals.Address
import com.rentals.Branch
import com.rentals.users.employee.Manager
import com.rentals.users.landlord.PrivateOwner


class BootStrap {

	def managerService
	def privateOwnerService
	
	def init = { servletContext ->

		PrivateOwner po = new PrivateOwner(firstname:"firstname", lastname:"lastname", username:"privateowner", password:"privateowner")
		privateOwnerService.save(po)

		Manager manager = new Manager(
			firstname: 'Oleg', 
			lastname: 'Atsman', 
			sex: 'man', 
			position: 'manager', 
			dob: new Date(), 
			username:'manager',
			password:'manager'
		);
		managerService.save(manager)
		
		Branch branch = new Branch(
			tel_no: 'tel_no',
			fax_no: 'fax_no',
			address: new Address(
				street: 'street',
				area: 'area',
				city: 'city',
				postcode: 'postcode'
			),
			manager: manager
		).save(true)
	}
	def destroy = {
	}
}
