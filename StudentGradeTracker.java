import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("=== Student Grade Tracker ===");

        while (true) {
            System.out.print("Enter student name (or type 'done' to finish): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter grade for " + name + ": ");
            int grade = sc.nextInt();
            sc.nextLine(); // consume newline

            students.add(new Student(name, grade));
        }

        if (students.isEmpty()) {
            System.out.println("No students entered. Exiting...");
            return;
        }

        // Calculate average, highest, lowest
        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        String highestStudent = "";
        String lowestStudent = "";

        for (Student s : students) {
            total += s.grade;

            if (s.grade > highest) {
                highest = s.grade;
                highestStudent = s.name;
            }
            if (s.grade < lowest) {
                lowest = s.grade;
                lowestStudent = s.name;
            }
        }

        double average = (double) total / students.size();

        // Display summary report
        System.out.println("\n=== Student Report ===");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.grade);
        }

        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest + " (by " + highestStudent + ")");
        System.out.println("Lowest Score: " + lowest + " (by " + lowestStudent + ")");
    }
}
