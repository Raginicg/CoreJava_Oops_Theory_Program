package Code;
// Inheritance

class Student {
    void study() {
        System.out.println("Student is study");
    }
}
// To override study(), Need to define it in StudentInher using the @Override annotation.

public class StudentInher extends Student {
    @Override
    void study() {
        System.out.println("StudentInher is studying");
    }

    public static void main(String[] args) {
        Student stu=new Student();
        stu.study();
    	
    	StudentInher s = new StudentInher();
        s.study();
        
        Student s1 = new StudentInher();  // Upcasting (Allowed)-Its working fine and give the op-Student is study
        s1.study();
        
     //   StudentInher s2 = new Student();  // This line gives us error-Compilation Error

        /**
         * A parent class (Student) can not be assigned to a child class (StudentInher) reference.
         * This is because the parent does not necessarily have all the properties and behaviors of child.
         * Java does not allow implicit downcasting (assigning a superclass object to a subclass reference).
         */
        
//       If you want to do then you can used this approach- Explicitly cast
        
        StudentInher s2=(StudentInher)s1;
        s2.study();
        
        
    }
}

