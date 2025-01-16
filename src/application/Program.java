package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adicione o tamanho do array:");
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        
        System.out.println("Adicione os valores do array:");
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        
        double avg = sum / n;
        System.out.printf("Média das alturas: %.2f%n", avg);
                
        sc.close();
    }
}
