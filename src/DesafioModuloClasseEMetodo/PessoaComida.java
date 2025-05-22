package DesafioModuloClasseEMetodo;

public class PessoaComida {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Felipe", 65);
        Comida c1 = new Comida("Pastel", 0.7);
        p1.pesagem();
        p1.comer(c1);
        p1.pesagem();
    }
}
