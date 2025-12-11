package Collection;
import java.util.*;

class MyComparator1 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;  // reverse order
        else if (o1 > o2)
            return -1;
        else
            return 0;  // equal values
    }
}

public class ComparableVsComparator1 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(new MyComparator1()); // custom comparator
        t.add(19);
        t.add(20);
        t.add(17);
        t.add(19); // duplicate, won't be added
        System.out.println(t);
    }
}