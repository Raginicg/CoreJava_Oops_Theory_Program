package Java8;

@FunctionalInterface
interface MyFunctionalInterface {
    void display();
}

public class MyFunctionalClass {
    public static void main(String[] args) {
        // Lambda expression
        MyFunctionalInterface myFunc = () -> System.out.println("Hello, World!");
        myFunc.display();
    }
}
