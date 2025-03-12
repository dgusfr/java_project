package application.basic;

public class Fatoriais1a20 {

    public static void main(String[] args) {
        long fat = 1;
        for (int i = 1; i <= 20; i++) {
            fat = fat * i;
            System.out.println("O fatorial de " + i + " é " + fat);
        }
    }
}
