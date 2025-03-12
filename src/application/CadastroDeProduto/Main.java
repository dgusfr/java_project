package application.CadastroDeProduto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o código do produto? ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Qual o nome do produto? ");
        String nome = sc.nextLine();

        System.out.print("Qual o preço do produto? ");
        double preco = sc.nextDouble();
        sc.nextLine();

        System.out.print("Qual a categoria do produto (ELETRONICO, MOVEIS, ROUPAS)? ");
        String categoriaStr = sc.nextLine().toUpperCase();

        Categoria categoria = Categoria.valueOf(categoriaStr);

        Produto produto = new Produto(codigo, nome, preco, categoria);

        System.out.println(produto);

        sc.close();
    }
}
