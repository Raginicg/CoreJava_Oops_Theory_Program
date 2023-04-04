package basic_oops_concept;

/**@author ragigupt
 */
public class ConstructorExp {
	ConstructorExp ()
	{
		System.out.println("Creating Default Constructor...");
	}

	public static void main(String[] args) {
	// Constructor is a special kind of method that are used to initialized the object.
	// If you are not created the constructor then the by default, default constructor is called.
	// Rule--> Constructor has same name as class name.--> constructor has not have explicit return type.
	
	//-------Calling a Default constructor-------
	ConstructorExp o=new ConstructorExp();
}
}
