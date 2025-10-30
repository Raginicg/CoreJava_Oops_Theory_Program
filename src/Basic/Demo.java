package Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Customer{
	private String name;
	private int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Demo {
	public static void main(String args[])
	{

	List<Customer> customers=Arrays.asList(
		new Customer("Aryan", 27),
		new Customer("Abhi", 25),
		new Customer ("Dinesh", 30),
		new Customer("Ragini", 26),
		new Customer("Gupta", 28),
		new Customer("Rg", 32)
		);

	Optional<Integer> secondHighAge=customers.stream().map(Customer::getAge).distinct()
	.sorted(Comparator.reverseOrder())
	.skip(1).findFirst();
		secondHighAge.ifPresent(age->System.out.println("Second Highest Age"+ age));
	}
}
