package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Felipe", 10.0);
        Aluno a2 = new Aluno("Felipe", 9.0);
        Aluno a3 = new Aluno("Felipe", 8.0);
        Aluno a4 = new Aluno("Felipe", 6.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> nota = a -> a.nota;
        BinaryOperator<Double> somatorio = Double::sum;

        alunos.parallelStream()
                .filter(aprovado)
                .map(nota)
                .reduce(somatorio)
                .ifPresent(System.out::println);


    }
}
