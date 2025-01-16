package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adicione o tamanho do array:");
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        
        System.out.println("Adicione os valores do array:");
        for (int i = 0; i < n; i++) {
        	sc.nextInt();
        	String name = sc.nextLine();
        	double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        
        double sum = 0.0;
        
                
        sc.close();
    }
}
