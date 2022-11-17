package Collection;

import java.util.ArrayList;
import java.util.List;

public class TraverseArrayList 
{
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(3);
		
		for (int i=0; i<l.size(); i++) 
		{
		System.out.println("Element are "+ l.get(i));
		}
		
		for(Integer element:l) {
			System.out.println("Element are "+element);
		}
	}
}
