package Code;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListExample {
    public static void main(String[] args) {
        Random random = new Random();
        // Generate first list
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(random.nextInt(100)); // Random number between 0–99
        }

        // Generate second list
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(random.nextInt(100));
        }

        // Print both lists
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Get the 2nd index element from the first list
        if (list1.size() > 2) {
            System.out.println("Element at index 2 in List 1: " + list1.get(2));
        } else {
            System.out.println("List 1 does not have enough elements.");
        }
    }
}
