package application.IMC;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public void exibirDados() {
        System.out.printf("Nome: %s%nIdade: %d%nAltura: %.2f m%nPeso: %.2f kg%nIMC: %.2f%n",
                nome, idade, altura, peso, calcularIMC());
    }
}
