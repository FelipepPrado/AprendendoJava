package oo.heranca;

import java.time.Year;

public class Jogador {
    private int heath = 100;
    protected int x;
    protected int y;

    Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getHeath() {
        return heath;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY == 1){
            oponente.heath -= 10;
            return true;
        }
        else if (deltaX == 1 && deltaY == 0){
            oponente.heath -= 10;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean andar(Direcao direcao){
        switch(direcao){
            case NORTE:
                y++;
                break;
            case SUL:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }

}
