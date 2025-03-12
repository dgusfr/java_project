package basic;

public class SomaQuadrados1_50{
  public static void main(String[] args) {
  int soma = 0;
  int quadrado = 0;
  for(int i = 1; i <= 50; i++) {
    quadrado = i * i;
    soma += quadrado;
    System.out.println(i + "² = " + soma);
  }
  System.out.println("A soma dos quadrados dos valores é  " + soma);
}
}
