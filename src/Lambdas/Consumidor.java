package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        // Consumer recebe um tipo e não retorna nada!
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Notebook", 3000.0, 0.30);
        Produto p3 = new Produto("Caderno", 20.00, 0.10);
        Produto p4 = new Produto("Lapis", 7.99, 0.20);
        Produto p5 = new Produto("Mochila", 300.00, 0.15);


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimirNome);
        System.out.println();
        produtos.forEach(p -> System.out.println(p.preco));
        System.out.println();
        produtos.forEach(System.out::println);
    }
}
