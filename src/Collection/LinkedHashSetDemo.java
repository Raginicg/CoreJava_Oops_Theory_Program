package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) 
{
	
	LinkedHashSet h=new LinkedHashSet();
	h.add(1);
	h.add(3);
	h.add(3);
	System.out.println(h); // insertion order maintained
}
}
