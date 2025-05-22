package oo.composition;

import java.util.ArrayList;

public class Aluno {
    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<>();

    Aluno(String nome){
        this.nome = nome;
    }

    public String toString(){
        return nome;
    }

    void addCurso(Curso curso){
        this.cursos.add(curso);
    }

    Curso obterCurso(String nome){
        for(Curso curso : cursos){
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }
}
