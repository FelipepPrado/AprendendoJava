package ArrayseCollections;

import java.util.Objects;

public class UsuarioList {
    String nome;

    UsuarioList(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Nome: " + nome;
    }

    public boolean equals(Object obj){
        if(obj instanceof UsuarioList){
            UsuarioList outro = (UsuarioList) obj;
            return this.nome.equals(outro.nome);
        }
        return false;
    }
}
