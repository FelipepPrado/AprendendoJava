package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Felipe", 10);
        Aluno a2 = new Aluno("Pedro", 9);
        Aluno a3 = new Aluno("Luis", 8);
        Aluno a4 = new Aluno("Patric", 7);
        Aluno a5 = new Aluno("João Paulo", 6);
        Aluno a6 = new Aluno("Maria", 5);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
        alunos.stream()
                .filter(a -> a.nota >= 7)
                .map(a -> "Parabens " + a.nome + " você foi aprovado(a) com " + a.nota)
                .forEach(System.out::println);
    }
}
