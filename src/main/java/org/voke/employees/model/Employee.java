package org.voke.employees.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Employee {
	
	private long id;
	private String EmployeeName;
	private String EmailAddress;
	private long age;
	private String departmentName; 
	private Date reportdate;
	
	//no argument constructor
		public Employee() {
			
		}
		
		//argument constructor
		
		public Employee(long id  , String EmployeeName, String EmailAddress, Long age, String departmentName ) {
			
			this.id = id;
			this.EmailAddress= EmailAddress;
			this.departmentName= departmentName;
			this.age=age;
			this.EmployeeName= EmployeeName;		
			this.reportdate= new Date();
			
			
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getEmployeeName() {
			return EmployeeName;
		}

		public void setEmployeeName(String employeeName) {
			EmployeeName = employeeName;
		}

		public String getEmailAddress() {
			return EmailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			EmailAddress = emailAddress;
		}

		public long getAge() {
			return age;
		}

		public void setAge(long age) {
			this.age = age;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public Date getReportdate() {
			return reportdate;
		}

		public void setReportdate(Date reportdate) {
			this.reportdate = reportdate;
		}

		
	
	
	
	

}
