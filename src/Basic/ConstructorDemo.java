package Basic;

/*
 * Constructor used to create an object. We cannot create an object without CONSTRUCTOR.
 * Constructor has same name as class name and doesn't have the return types.
 */
public class ConstructorDemo {
	String name;

	public ConstructorDemo(String name) {
		this.name=name;
	}
	public static void main(String[] args) {

	// line 15 giving error because default constructor is called when you havent write the logic of constructor
	//	ConstructorDemo c=new ConstructorDemo(); // Default constructor without parameter (Dont need to write the logic for the constructor)
		ConstructorDemo c1=new ConstructorDemo("Ragini"); // Default constructor without parameter (Dont need to write the logic for the constructor)
		
	}

}
