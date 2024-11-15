package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class ProgramStudent {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student stu = new Student();

        System.out.print("Enter the first note of first trimester: ");
        stu.note1 = sc.nextDouble();

        System.out.print("Enter the second note of second trimester: ");
        stu.note2 = sc.nextDouble();

        System.out.print("Enter the third note of third trimester: ");
        stu.note3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", stu.average());
        System.out.println(stu.approvalStatus());

        sc.close();
    }
}
