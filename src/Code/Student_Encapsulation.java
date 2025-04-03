package Code;

/*
 * Encapsulation- Encapsulation is the binding of data memebrs and method into a singe unit.
 * 
 * Encapsulation-Data Security
 * Abstraction- Code Security
 * 
 * Hiding the data behind a method is called encapsulation.
 * 
 * We need to make variable are private-->Data Hiding
 * We need to make methods as a public
 * 
 */
public class Student_Encapsulation {

	private int id;
	private String name;
	
//	Default constructor
	Student_Encapsulation(){
		
	}
//	Constructor
	public Student_Encapsulation(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

}
