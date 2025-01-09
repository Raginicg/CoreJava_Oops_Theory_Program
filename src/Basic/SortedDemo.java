package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortedDemo {
	public static List<Integer> getValues(HashMap<Integer, Integer>map){
		List<Integer> values=new ArrayList<Integer>(map.values());
		Collections.sort(values);
		Collections.sort(values, Collections.reverseOrder());
		return values;
	}
public static void main(String[] args) {
	HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
			map.put(1, 10);
			map.put(2, 11);
			map.put(3, 4);
			List<Integer> sortedValues=getValues(map);
			System.out.println("Sorted Values"+ sortedValues);
}
}
