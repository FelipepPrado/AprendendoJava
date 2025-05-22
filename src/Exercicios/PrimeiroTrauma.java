package Exercicios;

public class PrimeiroTrauma {

    int a = 3; // Não pode mexer nessa linha!
    static int b = 4;

    public static void main(String[] args) {
        /*Não consigo acessa o "a" na main, devido o fato da main pertencer a classe
        e não a instância!*/
        PrimeiroTrauma tome = new PrimeiroTrauma();
        System.out.println(tome.a);// Não consigo acessar sem uma instância (é da instância)
        System.out.println(b); //Consigo acessar só com b (static)

    }
}
