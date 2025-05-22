package oo.heranca.Desafio;

//Dizer que algo tem um metoodo, mas nao padroniza a forma de como faz!
public interface Esportivo {
    void ligarTurbo();
    void desligarTurbo();

    default int velocidadeDoAr(){
        return 1;
    }
}
