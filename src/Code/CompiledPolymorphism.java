package Code;

public class CompiledPolymorphism {
	// This is the example of compile time polymorphism because same method present in one class.
	// Different arguments in form of no. of arguments, sequence of arguments, types of arguments
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	void sum(int a) {
		System.out.println(a);
	}
public static void main(String[] args) {
	CompiledPolymorphism p=new CompiledPolymorphism();
	p.sum(12);
	p.sum(1, 20);
}
}
