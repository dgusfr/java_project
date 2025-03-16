package application.avaliaTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite o valor do lado A: ");
        double side_A = sc.nextDouble();

        System.out.println("Digite o valor do lado B: ");
        double side_B = sc.nextDouble();

        System.out.println("Digite o valor do lado C: ");
        double side_C = sc.nextDouble();

        Triangulo triangulo = new Triangulo(side_A, side_B, side_C);
        
        System.out.println("O triângulo é: " + triangulo.avaliaTriangulo());

        sc.close();
    }
}
