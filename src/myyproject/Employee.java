package myyproject;

public class Employee 
{
     private String FirstName;
     private String LastName;
     private String DepartmentName;
	
     
     public Employee() 
     {
		super();
		// TODO Auto-generated constructor stub
	 }


	public Employee(String firstName, String lastName, String departmentName) 
     {
			super();
			FirstName = firstName;
			LastName = lastName;
			DepartmentName = departmentName;
   	 }


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getDepartmentName() {
		return DepartmentName;
	}


	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	
	
	
	     
}
