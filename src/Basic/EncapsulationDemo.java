package Basic;

/**
 * 
 * @author ragigupt
 * 1. Encapsulation is the process of binding or wrapping of data members and method into a single unit.
 * 2. Or restricting access to any members of an object.
 */
/*
 * Encapsulation is binding of data variable and method into a single unit is called Encapsulation.
 * Example- If in the class private method are present and you have created the getter and setter method for accessing the that method is called encapsulation
 * How we can achieve Encapsulation ?
 * Declare the variable of class as private.
 * Provide public getter and setter method to view & modify the variable value.
 */
// This below EmployeeDetails is the example of encapsulation--> Create all variable as private and create getter and setter method for view and setting the data.

class EmployeeDetails{
	private int emp_id; // This is called Data Hiding
	// For accessing this variable in other class we need to create getter and setter method
	// Create a getter and setter method for this variable
	public void setEmpId(int emp_id1) {
		emp_id=emp_id1;
	}
	
	public int getEmpId() {
		return emp_id;
	}
}
// Here we have achieve the security
public class EncapsulationDemo {
public static void main(String[] args) {
	EmployeeDetails e=new EmployeeDetails();
	e.setEmpId(46);
	System.out.println(e.getClass());
	System.out.println(e.getEmpId());
}
	
	
}
