package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {

        Consumer<Object> print = System.out::print;//Printar mais facilmente do jeito que você desejar
        print.accept("Hello World\n");

        //Formas de criar o stream!
        print.accept("Criando o stream com os valores:\n");
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        print.accept("Criando o stream com um tipo String\n");
        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs,1,2).forEach(print);

        List<String> outrasLangs = Arrays.asList("C ", "C++ ", "Kotlin\n");
        outrasLangs.stream().forEach(print);

        //Stream.generate(() -> "a").forEach(print);
        Stream.iterate(0, n -> n + 1).forEach(print);
    }
}
