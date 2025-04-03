package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Both are available in same package.
 * 
 * List- List is the part of the Collection interface
 * List can store different type of data, duplicate data also.
 * List is followed Insertion order.
 * In the list add method is used to add the data
 * 
 * Map- Map is not the part of collection framework. It has own root
 * Map store the data inform of key and value.
 * In the list put method is used to insert the data
 * We can not add the duplicate key but we can have duplicate value
 *
 */
public class MapListDiff {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add("Ragini");
		l1.add(10);
		l1.add(null);
		l1.add("Ragini");
		System.out.println(l1); // [Ragini, 10, null, Ragini]
		
		Map<String , String> map=new HashMap<String, String>();
		map.put("Ragini", "Gupta");
		map.put("Ragini", "Anand");
		map.put(null, null);
		map.put("Beauty", "Gupta");
		System.out.println("Map Elements "+ map);
//		{null=null, Beauty=Gupta, Ragini=Anand}
	}

}
