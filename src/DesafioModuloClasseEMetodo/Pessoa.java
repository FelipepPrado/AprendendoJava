package DesafioModuloClasseEMetodo;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida c){
        if(c != null){
            System.out.println(nome + " está comendo " + c.nome);
            peso += c.peso;
        }
        else {
            System.out.println("Gosto de nada!");
        }
    }

    void pesagem(){
        System.out.println(nome + " está pesando " + peso + "Kg");
    }
}
