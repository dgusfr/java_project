package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        
        System.out.println("Enter the informations: ");
        System.out.print("Name: ");
        emp.name = sc.next();
        
        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        
        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();

	}

}
