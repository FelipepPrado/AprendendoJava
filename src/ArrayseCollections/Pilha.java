package ArrayseCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("Java");
        livros.add("C");
        livros.push("C++");

        //Mesma coisa da Queue
       // System.out.println(livros.element());

        //Remove os ultimos a serem adicionados LAFA
        //System.out.println(livros.pop()); (Pop da erro quando não tiver nada)
        //System.out.println(livros.poll()); (poll retorna null quando não tiver nada)

        System.out.print("Livros organizados em ordem: ");
        for(String livro: livros){
            System.out.printf(livro + " ");
        }

    }
}
