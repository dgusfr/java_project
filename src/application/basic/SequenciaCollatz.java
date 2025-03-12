package application.basic;

import java.util.Scanner;

public class SequenciaCollatz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        System.out.println("Sequência de Collatz:");
        while (numero > 1) {
            System.out.println(numero);  

            if (numero % 2 == 0) {
                numero = numero / 2;      
            } else {
                numero = 3 * numero + 1;  
            }
        }

        System.out.println(numero); 
        sc.close();
    }
}
