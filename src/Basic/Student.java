package Basic;
import java.lang.Comparable;

class Student implements Comparable<Student> {
    int rollNumber;
    String name;
    
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
    
    @Override
    public int compareTo(Student other) {
        return this.rollNumber - other.rollNumber;
    }
    
    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + '}';
    }
}
