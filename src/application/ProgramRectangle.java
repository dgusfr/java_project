package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        
        System.out.println("Enter rectangle settings: ");
        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();
        
        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();

        sc.close();

	}

}
