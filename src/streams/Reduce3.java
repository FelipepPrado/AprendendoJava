package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Felipe", 10.0);
        Aluno a2 = new Aluno("Thayssa", 9.0);
        Aluno a3 = new Aluno("Pedro", 8.0);
        Aluno a4 = new Aluno("Vt", 6.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> nota = a -> a.nota;
        BiFunction<Media, Double, Media> calcularMedia = (media, nota1) -> media.adicionar(nota1);
        BinaryOperator<Media> combinarMedia = (m1,m2) -> Media.combinar(m1,m2);

        Media media = alunos.stream().filter(aprovado).map(nota).reduce(new Media(), calcularMedia, combinarMedia);
        System.out.println("Media da turma: " +  media.getValor());
    }
}
