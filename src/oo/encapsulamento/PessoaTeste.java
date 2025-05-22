package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Felipe");
        p1.setIdade(18);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

    }
}
