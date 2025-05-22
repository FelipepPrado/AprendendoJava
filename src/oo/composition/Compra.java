package oo.composition;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    double getTotalValue(){
        double total = 0;
        for(Item item: itens){
            total += item.preco*item.quantidade;
        }
        return total;
    }
}
