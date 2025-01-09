package Basic;

//Calling of one constructor from the another constructor within the same class or superclass of the constructor
//using super()

public class ConstructorChaining {
	
	private String name;

	public ConstructorChaining() {
	System.out.println("Hello");
	}
	public ConstructorChaining(String name) {
		this.name=name;
	}

public static void main(String[] args) {
}
}
