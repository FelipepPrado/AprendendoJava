package ArrayseCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();//Queue

        fila.add("Felipe");//Ocorre um erro quando a fila estiver cheia
        fila.offer("Raimunda");//Retorna verdadeiro ou falso, depende se da ou não na fila
        fila.offer("Sabrina");
        fila.offer("Thayssa");

        //Retornam elemento da fila
        //peek retorna nulo quando não tiver fila
        //ocorre um erro quando a fila estiver vazia
        System.out.println(fila.peek());
        System.out.println(fila.element());

        fila.poll();//Remove o primeiro da fila (Retorna null quando estiver vazia)
        fila.remove();//Remove o primeiro da fila (Ocorre um erro quando a fila estiver vazia)
        System.out.println(fila.element());

        //fila.size()
        //fila.contain()
        //fila.clear()
    }
}
