package Java8;

interface MyInterface {
    default void greet() {
        System.out.println("Hello");
    }
}

class DefaultDemo implements MyInterface{
	
}

public class DefaultInterfaceDemo  {
    public static void main(String[] args) {
    	DefaultDemo  obj = new DefaultDemo();
        obj.greet();
}
}