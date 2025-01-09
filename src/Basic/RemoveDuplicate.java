package Basic;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static List<Integer> removeDuplicates(List<Integer> list){
		List<Integer> uniqueList=new ArrayList<>();
		for(Integer element:list) {
			if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println("Original List: " + numbers);
        List<Integer> result = removeDuplicates(numbers);
        System.out.println("After deletion: " + result);
    }
}
