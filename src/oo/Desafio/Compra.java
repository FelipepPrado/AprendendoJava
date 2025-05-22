package oo.Desafio;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();

    void receberItem(String nome, double preco, int quantidade){
        Produto produto = new Produto(nome, preco);
        itens.add(new Item(quantidade, produto));
    }

    double obterValorTotal(){
        double total = 0;
        for(Item item : itens){
            total += item.obterValorTotal();
        }
        return total;
    }
}
