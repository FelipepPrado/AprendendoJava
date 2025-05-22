package Classes;

import Exercicios.Data;

public class ValorxReferencia {
    /*Resumo:
    * Basicamente quando você manda pro metódo um objeto você manda pro referência, ou seja,
    * você manda o endereço dele, assim como vetóres em C, mas quando você passa um tipo primitivo
    * você está enviando um copia do valor dele e não ele em si! */

    public static void main(String[] args){
        double a = 2;
        double b = a; //Atribuição por valor (tipo primitivo)
        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data(15, 06, 2006);
        Data d2 = d1; //Atribuição por referência (Objeto)
        System.out.println(d1.equals(d2)); //equals ele vê se d1 é igual a d2!
        d2.obterData();// Antes o obter data estava sem encapsulamento!
        /*Também consigo receber em um metodo um objeto e muda seus atributos, já que
        recebo o endereço de memória dele*/

        ValorxReferencia.alterarData(d1);// Nisso eu mudo o d1 e o d2, já que possuem o mesmo endereço
        d2.obterData();
    }

    static void alterarData(Data d){
        d.altData(25, 8, 2005);
    }

}
