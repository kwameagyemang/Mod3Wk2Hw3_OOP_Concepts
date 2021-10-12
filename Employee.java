package week2Homework3;

import OOPconcept.Address;

public class Employee {
	int emp_id;
	double emp_salary;
	Address addr;

	Employee(int emp_id, String name, int age, char gender, double emp_salary) {

		super(name, age, gender);

		this.emp_id = emp_id;
		this.emp_salary = emp_salary;
	}
	
	public void createAddress() {
		
		// Take user input for this Employee's address fields
		addr = new Address();
		
		// Currently hard coding
		addr.street = "101 South St.";
		addr.city = "Queen City";
		addr.state = "OH";
		addr.zipcode = 78686;
		
	}


}
