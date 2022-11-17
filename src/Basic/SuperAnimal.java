package Basic;
/**@author ragigupt
 */

/*
 * Super keyword are a reference variable that are used to refer as the current parent class object
 * In class we need to create constructor of class with the same name of class
 */

class SuperAnimal1{
	// Constructor
	SuperAnimal1(){
		System.out.println("Parent class");
	}
}
class Child extends SuperAnimal1{
	Child() {
		System.out.println("Child class");
	}
}
class SuperAnimal{
public static void main(String[] args) {
		Child c=new Child();

	}
}