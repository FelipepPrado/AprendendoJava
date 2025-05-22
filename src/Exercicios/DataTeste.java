package Exercicios;
import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua data de aniversário!!!!!");
        System.out.print("dia: ");
        int dia = entrada.nextInt();
        entrada.nextLine();
        System.out.print("mes: ");
        int mes = entrada.nextInt();
        entrada.nextLine();
        System.out.print("ano: ");
        int ano = entrada.nextInt();
        entrada.nextLine();

        Data data1 = new Data(dia, mes, ano);
        Data data2 = new Data();
        System.out.println("Data1:");
        data1.obterData();
        System.out.println("Data formatada: " + data1.obterDataFormatada());
        System.out.println("Data2:");
        data2.obterData();
        System.out.println("Data formatada: " + data2.obterDataFormatada());
    }
}
