package Collection;
import java.util.*;

class DescendingStringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1); // reverse order
    }
}

public class StringDescendingOrder {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(new DescendingStringComparator());
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");

        System.out.println("Strings in descending order:");
        System.out.println(set);
    }
}