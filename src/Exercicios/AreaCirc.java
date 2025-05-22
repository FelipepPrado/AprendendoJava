package Exercicios;

public class AreaCirc {
    double raio;
    static final double PI = 3.14;//static diz que o pi pertence a classe, ou seja constante!
    //Consigo modificar o valor de pi, mas modifica para todas as instâncias dessa Classe
    //final é literalmente uma constante imutavel, deve ser inicializada!

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area(){
        return (Math.pow(raio,2))*PI;
    }
}
