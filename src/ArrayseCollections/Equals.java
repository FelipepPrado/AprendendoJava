package ArrayseCollections;

public class Equals {
    //hashcode retorna valor int
    //Equals retorna boolean]
    //hashcode serve pra tentar evitar a utilização de equals em muitos objetos!
    //Basicamente é uma restrição
    public static void main(String[] args){
        Usuario user1 = new Usuario("Felipe", "felipepdelimaa@gmail.com");
        Usuario user2 = new Usuario("Felipe", "felipepdelimaa@gmail.com");
        System.out.println(user1 == user2); //Da sempre falso!
        System.out.println(user1.equals(user2)); //Da sempre falso sem hashcode
        System.out.println(user2.equals(user1)); //Da sempre false sem hashcode
    }

}
