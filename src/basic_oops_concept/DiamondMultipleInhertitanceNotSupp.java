package basic_oops_concept;

/*
 * Multiple Inheritance is not supported in java because, if same method are present in 2 parent class then in child class
 * in the time of the object creation and after the invoking method which method is called, compiler have a ambiguity. That wise its not supported in java. 
 */

class Animal1 {
	void bark() {
		System.out.println(" Bark method of animal");
	}
}

class Dog1 {
	void bark() {
		System.out.println(" Bark method of Dog");
	}
}
//
//public class DiamondMultipleInhertitanceNotSupp extends Animal1, Dog1

// public class DiamondMultipleInhertitanceNotSupp extends Animal1, Dog1 // This line gives error-->syntax error
//{

//	public static void main(String[] args) {
//		DiamondMultipleInhertitanceNotSupp d=new DiamondMultipleInhertitanceNotSupp();
//		// Which method is called from both the class
//		d.bark();
//	}

//}
