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
        StudentInher s = new StudentInher();
        s.study();
    }
}

