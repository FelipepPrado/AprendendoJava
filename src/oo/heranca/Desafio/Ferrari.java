package oo.heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
    private boolean ar = false;
    public Ferrari() {
        super(500);
        setDelta(15);
    }

    @Override
    public void acelerar(){
        super.acelerar();
    }

    @Override
    public void frear(){
        super.frear();
    }

    @Override
    public void ligarTurbo(){
        setDelta(35);
    }

    @Override
    public void desligarTurbo(){
        setDelta(15);
    }

    @Override
    public void ligarAr(){
        ar = true;
    }

    @Override
    public void desligarAr(){
        ar = false;
    }
}
