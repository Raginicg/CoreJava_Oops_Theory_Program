package Collection;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(4);
	list.add(5);
	
	List<Integer> list2=new ArrayList<>();
	list2.add(7);
	// This method add the list1 into the list2
	list.addAll(list2);
	System.out.println(list);
	
	List<String> s=new ArrayList<>();
	s.add("Ragini");
	s.add("Aradhya");
	System.out.println(list.size());
	
	List<String> s1=new ArrayList<>();
	s1.add("Anand");
	s1.addAll(s);
	System.out.println(s1);
	
	System.out.println("Second element in Arraylist string is "+s1.get(1));
	
	s.remove(1);
	System.out.println("Removing element from s "+s);
	
	s.remove(String.valueOf("Aradhya"));
	System.out.println("Remove element using value "+s);
	// Clear the list
	s.clear();
	System.out.println(s);
	
}
}
