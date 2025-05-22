package oo.heranca;

public class Heroi extends Jogador{
    //extends é a forma de herdar!

    public Heroi(int x, int y){
        super(x, y);
    }

    @Override
    public boolean atacar(Jogador oponente){
        boolean at1 = super.atacar(oponente);
        boolean at2 = super.atacar(oponente);
        return at1 && at2;
    }
}
