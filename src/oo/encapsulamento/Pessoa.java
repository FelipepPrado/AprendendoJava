package oo.encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    //Setter: ele seta um valor, ou seja, recebe um valor.
    //Getter: ele retorna o valor.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
