package oo.composition;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Felipe";
        c1.itens.add(new Item("Caneta", 5, 1.50));
        c1.itens.add(new Item("Borracha", 3, 3.50));
        c1.itens.add(new Item("Caderno", 2, 39.99));

        System.out.println(c1.getTotalValue());
    }
}
