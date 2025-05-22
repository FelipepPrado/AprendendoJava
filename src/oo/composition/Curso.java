package oo.composition;

import java.util.ArrayList;

public class Curso {
    final String nome;
    final ArrayList<Aluno> alunos = new ArrayList<>();

    Curso(String nome){
        this.nome = nome;
    }

    public String toString(){
        return nome;
    }

    void addAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.addCurso(this);
    }

}
