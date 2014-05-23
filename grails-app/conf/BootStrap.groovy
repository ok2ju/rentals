import java.util.regex.Pattern.Branch

import com.rentals.Address
import com.rentals.Branch
import com.rentals.users.employee.Employee;
import com.rentals.users.employee.Manager
import com.rentals.users.employee.Staff
import com.rentals.users.landlord.PrivateOwner


class BootStrap {

	def managerService
	def privateOwnerService
	def staffService
	
	def init = { servletContext ->

		PrivateOwner po = new PrivateOwner(
			firstname:"firstname", 
			lastname:"lastname", 
			username:"privateowner", 
			password:"privateowner"
		)
		privateOwnerService.save(po)

		Manager manager = new Manager(
			firstname: 'Oleg', 
			lastname: 'Atsman', 
			sex: 'm', 
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
		
		Staff employee = new Staff(
			username: 'employee',
			password: 'employee',
			firstname: 'Lesha',
			lastname: 'Vakulich',
			address: 'Grodno, Klenovaya 35',
			sex: 'm',
			position: 'Senior Employee',
			branch: branch
		)
		
		staffService.save(employee)
		
		branch.addToEmployees(employee)
		branch.save()
	}
	def destroy = {
	}
}
