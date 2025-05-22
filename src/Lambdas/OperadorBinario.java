package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperadorBinario {
    public static void main(String[] args) {

        // Forma mais aceita:
        BinaryOperator<Double> media
                = (n1, n2) -> (n1 + n2) / 2;

        Function<Double, String> resultado1 =
                m -> m >= 7.0 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(resultado1).apply(6.0, 6.0));

        // Forma mais específica:
        BiFunction<Double, Double, String> resultado2 =
                (n1,n2) -> ((n1+n2)/2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado2.apply(10.0, 7.0));


    }
}
