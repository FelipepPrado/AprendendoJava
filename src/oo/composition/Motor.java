package oo.composition;

public class Motor {
    boolean ligado = false;
    double fatorInjecao = 1.0;

    int giros(){
        if (ligado){
            return (int) Math.round(fatorInjecao);
        }
        else{
            return 0;
        }
    }
}
