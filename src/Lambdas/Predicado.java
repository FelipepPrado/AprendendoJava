package Lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        // Predicado recebe algum tipo e retorna um boolean!
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 1000;
        System.out.println(isCaro.test(new Produto("Notebook", 4000.0, 0.15)));
    }
}
