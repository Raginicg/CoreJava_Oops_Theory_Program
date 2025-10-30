package Java8;
/**
 * Interface having exactly single abstract method but any number of default and static method
 * Using functional interface, we can invoke lambda expression.
 */
@FunctionalInterface
interface MyFunctionalInterface {
    public String login(String username);
}

public class MyFunctionalClass {
    public static void main(String[] args) {
        // Lambda expression
        MyFunctionalInterface myFunc = (x) -> 
        {
        	System.out.println("This is login " + x);
            return x;
           };
      myFunc.login("Rags");
    }
}
