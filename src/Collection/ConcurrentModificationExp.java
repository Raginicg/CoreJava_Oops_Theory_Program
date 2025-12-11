package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Need of Concurrent Collection?
 * -Because most of the Tradition collection are Not-Thread safe.
 * -Vector and Hashtable is Thread safe, but at a time only one operation can be perform.
 * To overcome this problem Concurrent Collection come in the picture.
 * It a Thread Safe but we can perform multiple operation at a time.
 * 
 * ConcurrentModification is the Runtime exception that occurs when a collection is modified during iteration.
 * 
 * ConcurrentHashMap is a thread-safe, high-performance implementation of the Map.
 */
public class ConcurrentModificationExp {

    public static void test() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        // This will throw ConcurrentModificationException
        try {
            for (String s : list) {
                list.remove(s);  // Unsafe modification
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        // Safe removal using iterator
        list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Iterator<String> listIterator = list.iterator();

        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if (element.equals("b")) {
                listIterator.remove(); // Safe
            }
        }

        System.out.println("After safe removal: " + list);
    }

    public static void main(String[] args) {
        test();

        // Using CopyOnWriteArrayList to avoid ConcurrentModificationException
        List<String> lista = new CopyOnWriteArrayList<>(List.of("A", "B", "C"));

        for (String item : lista) {
            if (item.equals("B")) {
                lista.remove(item); // No exception occur
            }
        }
     
        System.out.println("CopyOnWriteArrayList after removal: " + lista);
    }
    
 
}
