package streams;

import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Function<Integer,String> binary = numb -> Integer.toBinaryString(numb);
        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> toInt = s -> Integer.parseInt(s, 2);

        System.out.println("Formato binario:");
        nums.stream().map(binary).forEach(System.out::println);
        System.out.println();
        System.out.println("Formato binario ao contrario:");
        nums.stream().map(binary).map(inverter).forEach(System.out::println);
        System.out.println();
        System.out.println("Colocando em formato de numero novamente");
        nums.stream().map(binary).map(toInt).forEach(System.out::println);
        System.out.println();
    }
}
