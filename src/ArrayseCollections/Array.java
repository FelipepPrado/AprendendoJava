package ArrayseCollections;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //É estático(tamanho fixo)
        //Homogêneo, ou seja, todos os elementos tem tamanho fixo
        //Array é um objeto
        /*sintaxe:
        tipo[] nome = new tipo[tamanho];*/

        /*Acessando:
        nome[posição acessada de 0 a (tamanho - 1)]
         */

        //double[] notasAlunoA = new double [3];
        //ou
        //double[] notasAlunoA = {10.0 , 9.0 , 7,0}
        double[] notasAlunoA = {10.0 , 9.0, 7.0};
        System.out.println(Arrays.toString(notasAlunoA));

        //Inicilizando com Scanner:
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < notasAlunoA.length; i++) {
            System.out.println("Insira a " + (i + 1) + "(a) nota do aluno: ");
            notasAlunoA[i] = entrada.nextDouble();
            entrada.nextLine();
        }

        //Formas de Printar:

        //Primeira forma: PIOR FORMA!
        System.out.println(Arrays.toString(notasAlunoA));

        //Segunda forma: MELHOR FORMA!
        for (double i : notasAlunoA) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Terceira forma: SEGUNDA MELHOR FORMA!
        for (int i = 0; i < notasAlunoA.length; i++) {
            System.out.print(notasAlunoA[i] + " ");
        }

    }
}
