package Collection;

import java.util.HashSet;

public class Hashing {

	public static void main(String[] args) {
// Creating
		HashSet<Integer> set=new HashSet<>();
		set.add(2);
		set.add(3);
		set.add(2); // duplicate element not allowed
		System.out.println(set);  // [2,3]
		//		Size of set
		System.out.println("Size of set are "+ set.size());
		
//		For searching set element--->contains
		if(set.contains(2)) {
			System.out.println("Set contains 2");
		}
		else {
			System.out.println("Not contains ");
		}
//		Delete
		set.remove(2);
		if(!set.contains(2)){
			System.out.println("Does not contains"+ 2);
		}
		
	}

}
