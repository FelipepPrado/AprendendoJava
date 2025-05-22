package Exercicios;


public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc area = new AreaCirc(10);
        /*Não consigo modificar porque é final:
        AreaCirc.PI = 3.1415;//Modificando o valor de pi!*/
        System.out.println(area.area());
        //AreaCirc area2 = area; area2 recebe o endereço de memória do area, ou seja, não é uma copia
        //Eles vão possuir os mesmos dados, assim como modificam as mesmas coisas

    }
}
