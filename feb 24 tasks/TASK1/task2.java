import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    String name;
    int[] marks;
    int total;
    double average;

    // Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.total = Arrays.stream(marks).sum(); // Calculate total marks
        this.average = (double) total / marks.length; // Calculate average marks
    }

    // Sorting logic: Sort students based on total marks (Descending)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.total, this.total); // Descending order
    }
}

public class StudentMarksSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Accept number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        Student[] students = new Student[numStudents];

        // Input student details
        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // Consume newline
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            int[] marks = new int[numSubjects];
            System.out.println("Enter marks for " + name + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }

            students[i] = new Student(name, marks);
        }

        // Sort students by total marks
        Arrays.sort(students);

        // Display sorted results
        System.out.println("\nSorted Student List (Based on Total Marks):");
        System.out.printf("%-15s %-10s %-10s\n", "Name", "Total Marks", "Average");
        System.out.println("------------------------------------------");

        for (Student s : students) {
            System.out.printf("%-15s %-10d %-10.2f\n", s.name, s.total, s.average);
        }

        scanner.close();
    }
}
