package Collection;

import java.util.TreeSet;

import java.util.Comparator;

public class EmployeeCustomComparator {
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Rg");
        Employee e2 = new Employee(50, "Bea");
        Employee e3 = new Employee(150, "Raj");
        // TreeSet with custom Comparator to sort by id
        TreeSet<Employee> t = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.id, e2.id);
            }
        });

        t.add(e1);
        t.add(e2);
        t.add(e3);

        System.out.println(t);
    }
}

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", name='" + name + "'}";
    }
}