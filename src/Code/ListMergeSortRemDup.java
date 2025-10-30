package Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
// Merge, Remove Duplicates, and Sort Without Built-in Sort
public class ListMergeSortRemDup {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(5, 2, 8);
        List<Integer> list2 = List.of(3, 2, 9);

        // Merge lists
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        // Remove duplicates using HashSet
        HashSet<Integer> uniqueSet = new HashSet<>(mergedList);
        mergedList = new ArrayList<>(uniqueSet);
    
        Collections.sort(mergedList);
        // Sort using Bubble Sort
        for (int i = 0; i < mergedList.size() - 1; i++) {
            for (int j = 0; j < mergedList.size() - i - 1; j++) {
                if (mergedList.get(j) > mergedList.get(j + 1)) {
                    // Swap
                    int temp = mergedList.get(j);
                    mergedList.set(j, mergedList.get(j + 1));
                    mergedList.set(j + 1, temp);
                }
            }
        }

        // Output result
        System.out.println("Sorted list without duplicates: " + mergedList);
    }
}
