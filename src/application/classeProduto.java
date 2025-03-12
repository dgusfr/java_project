package application;

import java.util.Scanner;

public class classeProduto {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Qual o codigo do produto? ");
  int codigo = sc.nextInt();

  System.out.println("Qual o nome do produto? ");
  String nome = sc.nextLine();

  System.out.println("Qual o preço do produto? ");
  double preco = sc.nextDouble();

  enum categoria {ELETRONICO, MOVEIS, ROUPAS}

    System.out.printf("O Produto %s, com código %d, custa R$ %.2f e faz parte da categoria ", nome, codigo, preco);

  sc.close();

  }

}
