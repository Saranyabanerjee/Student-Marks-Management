import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            System.out.print("Enter marks: ");
            double marks = sc.nextDouble();
            sc.nextLine(); // consume newline

            Student s = new Student(name, roll, marks);
            manager.addStudent(s);
        }

        System.out.println("\n--- Student Report ---");
        manager.displayStudents();
        sc.close();
    } 
}
