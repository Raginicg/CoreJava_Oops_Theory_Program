package Code;


class Animal{
	void eat() {
		System.out.println("Parent class");
	}
}
class Child extends Animal{
	void bark() {
		System.out.println("Child class");
	}
}
public class TestInheritance {
public static void main(String[] args) {
	Child c=new Child();
	c.bark();
	c.eat();
}
}
