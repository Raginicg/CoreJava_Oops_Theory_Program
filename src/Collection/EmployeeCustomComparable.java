package Collection;

import java.util.TreeSet;

public class EmployeeCustomComparable {
    public static void main(String[] args) {
        EmployeeComparable e1 = new EmployeeComparable(100, "Rg");
        EmployeeComparable e2 = new EmployeeComparable(50, "Bea");
        EmployeeComparable e3 = new EmployeeComparable(150, "Raj");

        TreeSet<EmployeeComparable> t = new TreeSet<>();
        t.add(e1);
        t.add(e2);
        t.add(e3);

        System.out.println(t);
    }
}

class EmployeeComparable implements Comparable<EmployeeComparable> {
    int id;
    String name;

    public EmployeeComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(EmployeeComparable obj) {
        int id1 = this.id;
        int id2 = obj.id;

        if (id1 < id2) {
            return -1;
        } else if (id1 > id2) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "{id=" + id + ", name='" + name + "'}";
    }
}