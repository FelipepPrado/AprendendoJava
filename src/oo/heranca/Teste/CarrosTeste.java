package oo.heranca.Teste;

import oo.heranca.Desafio.Ferrari;
import oo.heranca.Desafio.Fusca;

public class CarrosTeste {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        Fusca fusca = new Fusca();
        ferrari.ligarTurbo();
        ferrari.acelerar();
        ferrari.desligarTurbo();
        ferrari.acelerar();
        fusca.acelerar();

        System.out.println(ferrari);
        System.out.println(fusca);
    }

}
