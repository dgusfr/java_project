package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Height {

	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adicione o tamanho do array:");
        int n = sc.nextInt();
        int[] vet = 
        
        System.out.println("Digite um numero:");
        for (int i = 0; i < numeros.length; i++) {
        	double price = sc.nextDouble();
            numeros[i] = new Product(name, price);
        }
        
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
        	sum += vect[i].getPrice();
        }
        
        double avg = sum / n;
        
        System.out.printf("Average price: %.2f%n", avg);
                
        sc.close();
    }

}
