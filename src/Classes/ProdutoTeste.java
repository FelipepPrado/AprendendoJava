package Classes;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        //Não preciso importar nenhuma classe já q está no packge Classes
        int a = 3;
        Scanner entrada = new Scanner(System.in);

        //Primeiro produto
        String nome1 = "Abacaxi";
        double preco1 = 10.90;
        Produto.desconto = 0.25;
        Produto p1 = new Produto(nome1, preco1);
        System.out.printf("Preço final: %.2f\n", p1.desconto());
        System.out.printf("Preço com descontodo do gerente: %.2f\n", p1.descontoGerente(0.10));

        //Segundo produto
        String nome2 = "Notebook";
        double preco2 = 4000.00;
        Produto.desconto = 0.10;
        var p2 = new Produto(nome2, preco2);//var completa
        System.out.printf("Preço final: %.2f\n", p2.desconto());
        System.out.printf("Preço com descontodo do gerente: %.2f\n" ,p2.descontoGerente(0.10));
    }
}
