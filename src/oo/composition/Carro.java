package oo.composition;

public class Carro {
    Motor motor = new Motor();

    void acelerar(){
        motor.fatorInjecao += 0.5;

    }
    void frear(){
        if(motor.fatorInjecao >= 0.5) {
            motor.fatorInjecao -= 0.5;
        }
    }

    void ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
        motor.fatorInjecao = 0;
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
