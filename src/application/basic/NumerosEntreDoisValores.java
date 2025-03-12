package application.basic;
import java.util.Scanner;

public class NumerosEntreDoisValores {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro número inteiro: ");
    int numero_um = sc.nextInt();

    System.out.print("Digite o segundo número inteiro: ");
    int numero_dois = sc.nextInt();

    if (numero_um < numero_dois) {
      for (int i = numero_um; i <=numero_dois; i++){
        System.out.print(i + " ");
    }
    }else{
      for (int i = numero_dois; i <=numero_um; i++){
        System.out.print(i + " ");
      }
    }
  sc.close();
  }
}
