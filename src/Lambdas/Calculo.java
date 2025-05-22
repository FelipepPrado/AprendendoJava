package Lambdas;

@FunctionalInterface // Já defini que vai ter um único metodo
public interface Calculo {

    double executar(double a, double b);

    default String legal(){
        return "legal";
    }

    static String muitolegal(){
        return "muitolegal";
    }
    // default e static pode ser utilizado em uma interface funciona, porque não influencia no lambda
    // Só pode ter um metodo abstrato
}
