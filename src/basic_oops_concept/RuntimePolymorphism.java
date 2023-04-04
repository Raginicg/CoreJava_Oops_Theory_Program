package basic_oops_concept;


class Calculate{
	void area(float radius) {
		float result=3.14f* radius;
		System.out.println("Circle area is "+ result );
	}
}
//A child class has the same method present in parent class is known as Runtime or method overriding polymorphism.

public class RuntimePolymorphism extends Calculate{
	void area(int length, int breath) {
		float result=length * breath;
		System.out.println("Rectangele area is "+ result);
	}
	public static void main(String[] args) {
		RuntimePolymorphism r=new RuntimePolymorphism();
		r.area(12);
		r.area(2, 3);
	}

}
