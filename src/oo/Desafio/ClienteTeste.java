package oo.Desafio;


public class ClienteTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.receberItem("Lápis", 1.50, 4);
        compra1.receberItem("Caderno", 40.0, 2);
        compra2.receberItem("Placa de Vídeo", 1500.0, 1);
        compra2.receberItem("Processador", 1000.0, 1);
        
        Cliente cliente1 = new Cliente("Felipe");
        cliente1.addCompra(compra1);
        cliente1.addCompra(compra2);

        System.out.println(cliente1.nome + " fez " + cliente1.compras.size() + " compras no total de " + cliente1.obterValorTotal()
        + "R$" );

    }
}
