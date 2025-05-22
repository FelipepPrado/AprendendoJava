public class Introduction { //Forma de comentar
    //public class é basicamente uma classe
    static void frase(){
        System.out.println("Testando function in Java");
    }
    public static void main(String[] args) { //Sim, isso é um metodo
        //Print do Java
        System.out.println("Forma de printar");

        //Tipos de Variáveis:
        char letra = 'a';
        String myname = "Felipe";
        byte x1 = 10;
        short x2 = 10;
        int x = 10;
        long x3 = 10000000L;
        float y = 1.5f;
        double z = 1.55555d;
        boolean flag = true;
        System.out.println(flag && flag);
        System.out.println(myname.indexOf("e") + 1);
        System.out.println(Math.max(x1, x3));

        if (!flag) {
            System.out.println("Condição verdadeira!");
        }
        else if (flag){
            System.out.println("Segunda condição verdadeira!");
        }
        else
            System.out.println("Condição Falsa!");

        switch (letra) {
            case 'a':
                System.out.println("A");
                break;

            default:
                System.out.println("B");
        }

        for(int i = 0; i < 5; i++){
            System.out.print(i + " ");
        }
        System.out.println("");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) { //Que nem o for do python
            System.out.print(i + "  ");
        }
        System.out.println("");
        frase();
    }
}
