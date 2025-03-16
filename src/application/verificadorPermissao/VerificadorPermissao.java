package application.verificadorPermissao; 

import java.util.Scanner;

public class VerificadorPermissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de permissões (inteiro): ");
        int codigoPermissao = scanner.nextInt();

        int mascaraEscrita = 0b10; 

        boolean possuiEscrita = (codigoPermissao & mascaraEscrita) != 0;

        if (possuiEscrita) {
            System.out.println("✅ Permissão de escrita ATIVADA.");
        } else {
            System.out.println("❌ Permissão de escrita DESATIVADA.");
        }

        scanner.close();
    }
}
