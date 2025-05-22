package Exercicios;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de notas que o aluno possui: ");
        int tamanho = entrada.nextInt();
        entrada.nextLine();

        double[] notas = new double[tamanho];
        double soma = 0;
        for (int i = 0; i < tamanho; i++){
            System.out.println("Digite a nota " + (i + 1) + " do aluno");
            notas[i] = entrada.nextDouble();
            soma += notas[i];
        }

        /*
        for (double nota: notas){
            soma += nota;
        }
        */
        double media = soma / tamanho;
        System.out.println("Media do Aluno: " + media);
    }
}
