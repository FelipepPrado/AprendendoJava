package oo.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        Cachorro a = new Cachorro();
        System.out.println(a.mover());
        System.out.println(a.mamar()); //Ele não vai ter caso eu instanciar só com Animal
        a.result();
    }
}
