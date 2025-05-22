package Lambdas;

public class CalculoTeste {

    public static void main(String[] args) {
        Multiplicar multiplicar = new Multiplicar();
        Calculo calculo = new Soma();
        System.out.println(calculo.executar(3,2));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(3,2));

    }
}
