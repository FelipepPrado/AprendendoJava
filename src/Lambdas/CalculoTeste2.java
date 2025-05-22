package Lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo calc = (x, y) -> { return x + y; };//Tipo interface, com um único comportamento
        System.out.println(calc.executar(2,3));

        calc = (x, y) -> x * y;//Caso de única sentença de código
        System.out.println(calc.executar(2,3));
    }
}
