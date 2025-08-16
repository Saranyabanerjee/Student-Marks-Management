import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Roll No\tName\tMarks\tGrade");
        for (Student s : students) {
            System.out.println(s.getRollNumber() + "\t" + s.getName() + "\t" + s.getMarks() + "\t" + s.getGrade());
        }
    }
}
