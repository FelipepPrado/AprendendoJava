package oo.composition;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Felipe");
        Aluno aluno2 = new Aluno("Thayssa");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Front end Completo");
        Curso curso3 = new Curso("React Native");

        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);


        curso2.addAluno(aluno2);
        curso2.addAluno(aluno3);

        curso3.addAluno(aluno1);
        curso3.addAluno(aluno3);

        for(Aluno aluno: curso1.alunos){
            System.out.println(aluno.nome + " Está matriculado no curso " + curso1.nome);
        }
        System.out.println();

        for(Aluno aluno: curso2.alunos){
            System.out.println(aluno.nome + " Está matriculado no curso " + curso2.nome);
        }
        System.out.println();

        for(Aluno aluno: curso3.alunos){
            System.out.println(aluno.nome + " Está matriculado no curso " + curso3.nome);
        }

        Curso cursoEncontrado = aluno1.obterCurso("Java Completo");

        if (cursoEncontrado != null){
            System.out.println("Alunos do curso " + cursoEncontrado.nome);
            for(Aluno aluno: cursoEncontrado.alunos){
                System.out.print(aluno + " ");
            }
        }
        else{
            System.out.println("Curso não encontrado!");
        }

    }
}
