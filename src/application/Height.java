package application;

import java.util.Locale;
import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("São quantas pessoas?");
        int n = sc.nextInt();
        
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        int negativos = 0;

        for (int i = 0; i < n; i++) {
           System.out.println("Dados da " + (i+1) + "pessoa:");
           System.out.println("Nome: ");
           nomes[i] = sc.next();
           System.out.println("Idade: ");
           idades[i] = sc.nextInt();
           System.out.println("Altura: ");
           nomes[i] = sc.next();
        }
        
        sc.close();


	}

}
