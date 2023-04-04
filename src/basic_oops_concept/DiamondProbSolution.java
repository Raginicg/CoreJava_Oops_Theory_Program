package basic_oops_concept;

// Diamond problem is solved by using default method
interface Dogs {
	default void bark() {
		System.out.println("Bark method of Interface A");
	}
}

interface Cat {
	default void bark() {
		System.out.println("Bark method for interface B");
	}
}

public class DiamondProbSolution implements Dogs,Cat {

	public void bark() {
		Dogs.super.bark();
		Cat.super.bark();
	}
	
	public static void main(String[] args) {
		DiamondProbSolution d=new DiamondProbSolution();
		d.bark();
	}

}
