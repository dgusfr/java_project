package application.IMC;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Altura (em metros, ex: 1.80): ");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida! Digite um número decimal (ex: 1.80).");
            sc.next();
        }
        double altura = sc.nextDouble();
        sc.nextLine();

        System.out.print("Peso (em kg, ex: 72.0): ");
        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida! Digite um número decimal (ex: 72.0).");
            sc.next();
        }
        double peso = sc.nextDouble();
        sc.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, altura, peso);
        pessoa.exibirDados();

        sc.close();
    }
}
