package application;

public class FibonacciAte100 {

	public static void main(String[] args) {
		int anterior = 0;
		int atual = 1;
		
		System.out.println("Série de Fibonacci: " + anterior);
		
		while (atual <= 100) {
			System.out.println("," + atual);
			int proximo = anterior + atual;
		}
	}

}
