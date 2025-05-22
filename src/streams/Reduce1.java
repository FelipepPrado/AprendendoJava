package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        BinaryOperator<Integer> soma = Integer::sum;

        Integer result = nums.stream().reduce(1, soma);
        System.out.println(result);

        Integer total = nums.parallelStream().reduce(100, soma);// Ele soma + 100 todas as vezes devido ao parallelStream
        System.out.println(total);

        nums.stream()
                .filter(n -> n >= 5)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
