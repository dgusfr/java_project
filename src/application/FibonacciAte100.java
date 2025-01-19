package application;

public class FibonacciAte100 {

    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;

        System.out.print("Série de Fibonacci: " + anterior);

        while (atual <= 100) {
            System.out.print(", " + atual);
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}
