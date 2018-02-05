package org.voke.employees.service;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import org.voke.employees.database.DatabaseClass;
import org.voke.employees.model.Employee;



public class EmployeeService {
	
	// am mapping it to the database class
	private static Map<String, Employee> employees = DatabaseClass.getEmployee();
	
	public EmployeeService() { //class constructor to instantiate the first values
		
		employees.put( "muriithi.wachira@gmail.com", new Employee(1L,"voke","muriithi.wachira@gmail.com",30L,"IT"));
		employees.put("wachira@gmail.com", new Employee(2L,"jonte","wachira@gmail.com",40L,"IT"));
		employees.put("wachiraa@gmail.com", new Employee(3L,"jontee","wachiraa@gmail.com",23L,"IT"));

		
	}
	public List<Employee> getAllEmployees(){
	 	return new  ArrayList<Employee>(employees.values());
	}

	public Employee getEmployee(String EmailAddress){
		return employees.get(EmailAddress);

	}

	public Employee addEmployee(Employee employee){
		employee.setId(employees.size() +1);
		employees.put(employee.getEmailAddress(), employee);
		return employee;
	}

	public Employee updateEmployee(Employee employee){
		if(employee.getEmailAddress().isEmpty()){
		return null;
	   }
		employees.put(employee.getEmailAddress(),employee);
		return employee;
	}

	public Employee removeEmployee(String EmailAddress){
		return employees.remove(EmailAddress);
	}
	

}
