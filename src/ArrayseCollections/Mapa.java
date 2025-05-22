package ArrayseCollections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        HashMap<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Felipe"); //Diferente do add é o put, além de substituir caso exista!
        usuarios.put(2, "Pedro");
        usuarios.put(3, "Thayssa");
        usuarios.put(4, "Joao");

        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet());//Retorna as chaves
        System.out.println(usuarios.values());//Retorna os valores das chaves
        System.out.println(usuarios.entrySet());//Retorna as chaves e os valores juntos
        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Felipe"));
        System.out.println(usuarios.get(1));

        System.out.println(usuarios.remove(4, "Joao"));//Removendo pela chave

        //Forma de printar as chaves
        System.out.println("\nPrintando as Chaves:");
        for(int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        //Forma de printar os valores
        System.out.println("\nPrintandos os valores das chaves:");
        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }

        //Forma de printar tudo!
        System.out.println("\nPrintando tudo:");
        for(Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print(registro.getKey() + ": ");
            System.out.println(registro.getValue());
        }
    }
}
