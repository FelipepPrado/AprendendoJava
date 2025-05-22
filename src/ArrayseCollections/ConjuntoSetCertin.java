package ArrayseCollections;


import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoSetCertin {
    public static void main(String[] args) {
        //Ordenados: SortedSet e TreeSet(Aceita a ordem de inicialização)
        SortedSet<String> listaAprovados1 = new TreeSet<>();// <Tipo>, so aceita o tipo predefinido
        listaAprovados1.add("Felipe");
        listaAprovados1.add("Vt");
        listaAprovados1.add("Louis Karalhou");
        listaAprovados1.add("Gaybriel");

        for (String nomes: listaAprovados1){
            System.out.println(nomes);//Vai printar desordenado!
        }

        System.out.println();

        Set<Integer> listaAprovados2 = new HashSet<>();// <Tipo>, so aceita o tipo predefinido
        listaAprovados2.add(1);
        listaAprovados2.add(2);
        listaAprovados2.add(3);
        listaAprovados2.add(4);

        for (int numb: listaAprovados2){
            System.out.println(numb);
        }

    }
}
