package Basic;

/**
 * 
 * @author ragigupt
 * 1. Encapsulation is the process of binding or wrapping of data members and method into a single unit.
 * 2. Or restricting access to any members of an object.
 */
/*
 * Encapsulation is the wrapping of data and method into a single unit.
 * How we can achieve Encapsulation ?
 * Declare the variable of class as private.
 * Provide public getter and setter method to view & modify the variable value.
 */
public class EncapsulationDemo {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		EncapsulationDemo e=new EncapsulationDemo();
		e.setName("Ragini");
		e.setAge(24);
		System.out.println("Name is "+ e.getName());
		System.out.println("Age is "+ e.getAge());
	}
	
}
