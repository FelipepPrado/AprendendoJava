package ArrayseCollections;

import java.util.ArrayList;

public class List {
    /* List:
    - Pode ser heterogênea
    - Aceita objetos duplicados
    - É ordenado (Aceita a ordem de inserção)
    - É indexado
     */
    public static void main(String[] args) {
        ArrayList<UsuarioList> lista = new ArrayList<>();
        UsuarioList u1 = new UsuarioList("Felipe");

        lista.add(u1);
        lista.add(new UsuarioList("Raimunda"));

        System.out.println(lista.get(1));//Acessando pelo índice!

        for(UsuarioList u: lista){
            System.out.println(u);
        }

        //lista.remove(1);
        System.out.println("Tem? " + lista.contains(new UsuarioList("Raimunda")));//Sem equals não funciona
    }

}
