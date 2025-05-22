package oo.abstrato;

public class Cachorro extends Mamifero {
    @Override
    public String mover(){
        return "Usando as patas";
    }

    @Override
    public String mamar(){
        return "Usando leite";
    }

    public boolean result(){
        if(this instanceof Animal){
            System.out.println("É um animal");
            return true;
        }
        else if(this instanceof Mamifero){
            System.out.println("É um mamifero");
            return false;
        }
        else{
            System.out.println("é um animal");
            return false;
        }
    }

}
