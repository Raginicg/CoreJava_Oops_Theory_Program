package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Cursor- Cursor are used to traverse object in collection one by one. In Java
 * 3 cursor are present. Enumeration - work with Vector class only, Only read
 * operation can perform Enumeration e=v.elements() Method-e.hasMoreElements()
 * 
 * Iterator- Universal cursor, Read and Write Operation done Iterator
 * itr=C.iterator(); Method- public boolean hasNext() public Object next()
 * public void remove()
 * 
 * ListIterator- Bidirection curors- Forward and Backward direction 
 * Method- Read, Remove, Add objects and Replaced
 * public boolean hasNetx, public Object next()
 * public int nextIndex()
 * Backward method-
 * public boolean hasPrevious()
 * public Object previous()
 * public int previousIndex()
 * 
 * public void remove()]
 * public void Set(Object new);  // for replacing object set is used
 * public void add(Object new)
 * 
 */
public class CursorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();

		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		Enumeration e = v.elements();
		// one by one
		while (e.hasMoreElements()) // more elements are present or not
		{
			Integer ei = (Integer) e.nextElement();
			if (ei % 2 == 0) {
				System.out.println(ei);
			}
		}

		//*******************************************************************
		// Iterator
		System.out.println("Using Itertor");
		ArrayList a = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			a.add(i);  
		}
		System.out.print(a);  // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		Iterator itr = a.iterator();
		while (itr.hasNext()) {
			Integer I = (Integer) itr.next();
			if (I % 2 == 0) {
				System.out.println(I);  // 0 2 4 6 8
			} 
			else {
				itr.remove();
			}
			
		}
		System.out.println(a); // [0, 2, 4, 6, 8]
		
		System.out.println("List Iterator Example");
		LinkedList l=new LinkedList<>();
		l.add("Ragini");
		l.add("Snehal");
		l.add("Beauty");
		System.out.println(l);
		
		// I want object one by one but while iterating one by one i want it can perform replace, add or remove operation
		
		ListIterator listitr=l.listIterator();
		while(listitr.hasNext()) {
			String s=(String) listitr.next();
			if(s.equals("Ragini")) {
				listitr.remove(); // remove this object --->[Snehal, Beauty]
			}
			else if(s.equals("Beauty")){
				listitr.add("Ragini");  // adding new object---> Add "Ragini" after "Beauty"  [Aadya, Beauty, Ragini]
			}
			else if(s.equals("Snehal"))
			{
				listitr.set("Aadya"); // set are used for replace, Replace "Snehal" with "Aadya" --->[Aadya, Beauty]
			}
		}
		System.out.println(l);
// The conditions are checked in the order of elements in the list, not in the order of if-else blocks
	}
	
}
