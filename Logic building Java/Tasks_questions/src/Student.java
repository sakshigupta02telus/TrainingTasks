import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String course;
    private int rollNumber;

    public Student(String name, int age, String course, int rollNumber) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("John Doe", 20, "Computer Science", 12345));
        studentList.add(new Student("Alice Smith", 22, "Mathematics", 54321));
        studentList.add(new Student("Andrew Johnson", 21, "Physics", 98765));
        studentList.add(new Student("Alex Brown", 19, "Chemistry", 67890));


        System.out.println("Students whose names start with 'A':");
        for (Student student : studentList) {
            if (student.getName().startsWith("A")) {
                System.out.println(student.getName());
            }
        }
    }
}
