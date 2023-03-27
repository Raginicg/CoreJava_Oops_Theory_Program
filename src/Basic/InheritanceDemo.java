package Basic;
/**@author ragigupt
 */

/*
 * Inheritance is the mechanism in which Acquire the property / behaviors of one Object
 * to the another object of another class.
 * It used for code reusability and method overriding. Or reduce redundancy
 * Single, Multilevel, Multiple, Hierarchical, Hybrid inheritance
 */
// Single level Inheritance

class Animal{
	void eat() {
		System.out.println(" Parent class");
	
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println(" Child class");
	}
}
class InheritanceDemo {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();
		
	}
}

// Every time three classes is present or more then this.
// In the last class we create the child class object and by using that object we called the parent
// class method and child class

//-----------------------------Single--->------------------------------------------------
/*  * class A--->class B extends A--->class Test (Here we create the object of child class that is B)
 * 
 */
//----------------------------------------------------------------------------------------

//-----------------------------Multilevel--->------------------------------------------------
/*  * class A--->class B extends A--->class C extends B--->class Test (Here we create the object of child class that is C)
* 
*/
//----------------------------------------------------------------------------------------

//-----------------------------Hierarchical--->------------------------------------------------
/*  * class A--->class B extends A--->class C extends A--->class Test (Here we create the object of child class that is C)
* 
*/
