package org.voke.employees.database;

import java.util.HashMap;
import java.util.Map;

import org.voke.employees.model.Employee;


public class DatabaseClass {
	//am mapping this to the employee service 
	private static Map<String, Employee> employees  = new HashMap<>();
	
	
	public static Map<String, Employee> getEmployee(){
		return employees;
	}
	

}
