package Lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> precoComDesconto =
                p1 -> p1.preco * (1 - p1.desconto);
        UnaryOperator<Double> impostoMunicipal =
                valor -> valor >= 2500 ? valor*(1 + 0.085): valor;
        UnaryOperator<Double> frete =
                valor -> valor >= 3000 ? valor + 100.0: valor +  50.0;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));
        Function<Double, String> formatar =
                valor -> ("R$" + valor).replace(".", ",");

        String resultado = precoComDesconto.
                        andThen(impostoMunicipal).
                        andThen(frete).
                        andThen(arredondar).
                        andThen(formatar).
                        apply(p);

        System.out.println(resultado);





    }
}
