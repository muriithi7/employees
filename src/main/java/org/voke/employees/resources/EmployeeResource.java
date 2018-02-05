package org.voke.employees.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.voke.employees.service.EmployeeService;
import org.voke.employees.model.*;

@Path("employee")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class EmployeeResource {
	
	private EmployeeService employeeService = new EmployeeService();

	@GET
	public List<Employee> Employee(){
		return employeeService.getAllEmployees();
	}


	@GET
	@Path("/{EmailAddress}")
	public Employee getEmployee(@PathParam("EmailAddress") String EmailAddress){
		return employeeService.getEmployee(EmailAddress);
	}

	@POST
	public Employee addEmployee(Employee employee){
		return employeeService.addEmployee(employee);

	}

	@PUT
	@Path("/{EmailAddress}")
	public Employee updateEmployee(@PathParam("EmailAddress") String EmailAddress, Employee employee){
		employee.setEmailAddress(EmailAddress);
		return employeeService.updateEmployee(employee);
	}

	@DELETE
	@Path("/{EmailAddress}")
	public void deleteEmployee(@PathParam("EmailAddress") String EmailAddress){
		employeeService.removeEmployee(EmailAddress);
	}

}
