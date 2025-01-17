package application;

import java.util.Locale;
import java.util.Scanner;

public class Height {

	public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adicione o tamanho do array:");
        int n = sc.nextInt();
        int[] vet = new int[n];
        
        int negativos = 0; 
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            vet[i] = sc.nextInt();
            if (vet[i] < 0) {
                negativos++; 
            }
        }
        System.out.println("Quantidade de números negativos: " + negativos);

         
        sc.close();
    }

}
