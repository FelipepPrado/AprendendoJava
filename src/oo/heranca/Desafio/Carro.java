package oo.heranca.Desafio;

public class Carro {
    final int VELOCIDADEMAX;
    protected int vel = 0;
    private int delta = 5;

    protected Carro(int VELOCIDADEMAX){
        this.VELOCIDADEMAX = VELOCIDADEMAX;
    }

    // Tem que ser publico pra ser acessado em todas as classes
    public String toString() {
        return "Velocidade: " + vel + "Km/h";
    }
    public void acelerar(){
        if(vel + delta > VELOCIDADEMAX){
            vel = VELOCIDADEMAX;
        }
        else {
            vel += delta;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public void frear(){
        if(vel - 5 >= 0){
            vel -= 5;
        }
        else{
            vel = 0;
            System.out.println("Carro freado");
        }
    }
}
