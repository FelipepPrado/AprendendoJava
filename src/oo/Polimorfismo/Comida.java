package oo.Polimorfismo;

public abstract class Comida {
    //Classes abstratas não podem ser instânciadas!

    private double peso;
    protected Comida(double peso){
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso > 0){
            this.peso = peso;
        }
    }

}
