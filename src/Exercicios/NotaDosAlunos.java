package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class NotaDosAlunos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de aluno: ");
        int alunos = entrada.nextInt();
        entrada.nextLine(); //So usa isso quando for usar pra puxar string ou pra evitar b.o

        String[] nomes = new String[alunos];
        for(int i = 0; i < alunos; i++){
            System.out.println("Digite o nome do aluno "+ (i+1) +": ");
            nomes[i] = entrada.nextLine();
        }
        System.out.println("Digite a quantidade de notas: ");
        int quantidade = entrada.nextInt();
        entrada.nextLine();

        double[][] notas = new double[alunos][quantidade];
        for (int i = 0; i < alunos; i++){
            System.out.println("Digite as notas do aluno "+ nomes[i] +": ");
            for (int j = 0; j < quantidade; j++){
                System.out.println("nota " + (j+1) + " :");
                notas[i][j] = entrada.nextDouble();
                entrada.nextLine();
            }
        }
        double soma = 0;
        for (int i = 0; i < alunos; i++){
            System.out.println("Notas do aluno "+ nomes[i] +": ");
            for (int j = 0; j < quantidade; j++){
                soma+=notas[i][j];
                System.out.println("nota " + (j+1) + " :" + notas[i][j]);
            }
        }
        double media = soma/(alunos*quantidade);
        System.out.println("Média da turma: "+ media);
        entrada.close();

        for (double[] notasDoAluno: notas){
            System.out.println(Arrays.toString(notasDoAluno));
        }

    }
}
