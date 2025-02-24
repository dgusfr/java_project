package application;

import java.util.Scanner;

public class SequenciaCollatz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero:");
		int numero = sc.nextInt();
		for(int i = 1; i <= 1000; i++) {
			soma = soma + i;
		}
		System.out.println(soma);

	}

}
