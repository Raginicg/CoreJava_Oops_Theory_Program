package Code;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class  WayToCreateObjects {
	String name;

	public  WayToCreateObjects(String name) {
		this.name = name;
	}

	void study() {
		System.out.println("Study ");
	}

	 WayToCreateObjects() {
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		// 1. way-Using new keyword
		 WayToCreateObjects w=new  WayToCreateObjects("Rg");
		 w.study();
		// 2. Using newInstance method of class
		 WayToCreateObjects stu= WayToCreateObjects.class.newInstance();  // in this no arguments we can pass-->no arg constructor
		 
		 // 3. Using getConstructor of Constructor class
		 Constructor< WayToCreateObjects> getConst=WayToCreateObjects.class.getConstructor(String.class);
		 
		 WayToCreateObjects obj=getConst.newInstance("G");
		 obj.study();
		 
		 // 4. clone method
		 WayToCreateObjects clone=( WayToCreateObjects) w.clone();
		 clone.study();
		 
		 // Deserialization-converting object into byte stream
		 
	}
}
	
