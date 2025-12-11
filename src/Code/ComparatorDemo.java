package Code;
import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Compare only by id
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(3, "Ravi"),
            new Employee(1, "Amit"),
            new Employee(2, "Zara")
        );

        Collections.sort(employees); // Sorts by id using compareTo

        employees.forEach(System.out::println);
    }
}