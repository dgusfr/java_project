package application.basic;

public class Fatoriais1a10 {

	public static void main(String[] args) {
		int fat = 1;
		for(int i = 2; i <= 10; i++) {
			fat = fat * i;
			System.out.println("O fatorial de " + i + " é " + fat);
		}
	}
}
