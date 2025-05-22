package oo.heranca.Teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        Heroi heroi = new Heroi(10, 11);
        monstro.setX(10);
        monstro.setY(10);
        System.out.println("x: " + monstro.getX() + "\ny: " + monstro.getY());
        System.out.println("x: " + heroi.getX() + "\ny: " + heroi.getY());

        System.out.println("Monstro tem: " + monstro.getHeath());
        System.out.println("Heroi tem: " + heroi.getHeath());

        monstro.atacar(heroi);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem: " + monstro.getHeath());
        System.out.println("Heroi tem: " + heroi.getHeath());
    }
}
