package Collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> animal=new Stack<>();
		animal.push("Tiger");
		animal.push("Cat");
		animal.push("Dog");
		// animal.pop();
		System.out.println("Present animal in stack are "+ animal);
		animal.pop();
		System.out.println("After performing pop operation result is "+ animal);
		
		// Functions in stack
		System.out.println("Peak element "+ animal.peek());
	}

}
