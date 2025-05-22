package oo.Polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);
        Arroz igrediente1 = new Arroz(0.25);
        Feijao igreditente2 = new Feijao(0.18);

        System.out.printf("%.2f\n", convidado.getPeso());

        convidado.comer(igrediente1);
        convidado.comer(igreditente2);
        System.out.printf("%.2f\n", convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.25);
        convidado.comer(sobremesa);
        System.out.printf("%.2f\n", convidado.getPeso());
    }
}
