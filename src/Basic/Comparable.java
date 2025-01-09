package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(102, "Alice"));
        students.add(new Student(101, "Bob"));
        students.add(new Student(103, "Charlie"));
        
        Collections.sort(students);  
        
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
