package Classes;

import Exercicios.Data;

public class ValorNulo {
    public static void main(String[] args){
        String s1 = "";
        System.out.println(s1);

        Data d1 = new Data();
        /*d1.mes =  6;*/ /*Além de mes ser privado e eu não conseguir acessar
        d1 é nulo, ou seja, não está apontando pra nenhum lugar*/

        String s2 = null;
        System.out.println(s2);//valor null no s2
    }
}
