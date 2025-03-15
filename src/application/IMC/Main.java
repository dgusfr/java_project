package application.IMC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        sc.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, altura, peso);
        pessoa.exibirDados();

        sc.close();

    }
}
