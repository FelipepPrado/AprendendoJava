package ArrayseCollections;

import java.util.HashSet;

public class ConjuntoSetBaguncado {
    /* Set:
    - Pode ser Heterogêneo(Diferente)(Forma não ideal)
    - Pode ser Homogêneo(Igual)(Forma ideal)
    - Não aceita objetos duplicados
    - Pode ordenar(Mas é não ordenado por padrão)
    - Não é indexado(Não da pra acessar índice em específico)
    */
    /* Métodos principais do Set:
    - .add(obj);(adiciona um objeto ao set)
    - .size(); (retorna o tamanho do set)
    - .clear(); (limpa o set por completo)
     */

    //@SuppressWarnings({"rawtypes", "unchecked"})
    @SuppressWarnings({"rawtypes", "unchecked"})//Serve pra suprimir os warnings
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2);// double -> Double
        conjunto.add(true);// boolean -> Boolean
        conjunto.add("Teste");// String
        conjunto.add(10);// Integer
        conjunto.add('x');// Caracter

        System.out.println("Tamanho do set: " + conjunto.size()); // Retorna o tamanho do set
        System.out.println(conjunto.remove("Teste")); // Remove um elemento
        System.out.println("Tamanho do set: " + conjunto.size());
        System.out.println(conjunto.contains("Teste")); // Verifica se há um elemento

        HashSet nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); //União de sets
        System.out.println("Tamanho do set: " + conjunto.size());
        System.out.println(conjunto);

        System.out.println(conjunto.retainAll(nums)); //Deixa somente a intersecção dos dois sets
        System.out.println(conjunto);// (P U V) ~U V <-> V
        conjunto.clear();
        System.out.println("Tamanho do set: " + conjunto.size());
    }
}
