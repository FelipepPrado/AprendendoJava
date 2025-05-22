package Classes;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    public Produto(String nomer, double precor){//Em java pode ter mais de 1 construtor!!!
        nome = nomer;
        preco = precor;
    }

    double desconto() {
        return preco*(1-desconto);
    }

    double descontoGerente(double descontoComGerente){
        return preco*(1-(desconto + descontoComGerente));
    }
}
