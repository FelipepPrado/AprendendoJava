package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        // NÃO: int -> Double
        // SIM: double -> Double

        BinaryOperator<Double> calc = (x, y) ->  (x + y);//Tipo interface, com um único comportamento
        System.out.println(calc.apply(2.0,3.0));

        calc = (x, y) -> x * y;//Caso de única sentença de código
        System.out.println(calc.apply(2.0,3.0));
    }
}
