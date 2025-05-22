package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> {return n + 2;}; //Pode ser escrito assim
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        // 0 + 2 -> (0+2)*2 -> ((0+2)*2)*((0+2)*2)
        int resultado = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(resultado);
    }
}
