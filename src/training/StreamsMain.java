package training;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

class StreamsMain {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ab", "abc", "bbc", "zav");

        // iteravimas ir spausdinimas su lambdom
        strings.forEach(s -> System.out.println(s));
        strings.forEach(s -> {
            int i = 1;
            System.out.println(s + i);
        });
        strings.forEach(System.out::println);
        System.out.println();

        // suskaciuosim kiek zodziu prasideda raide "a"
        long cnt = strings.stream().filter(s -> s.startsWith("a")).count();
        System.out.println("a... - " + cnt);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        // surenkam skacius didesnius uz 3
        List<Integer> collectedList = integerStream.filter(i -> i > 3).collect(toList());
        System.out.println(collectedList);

        // konvertuojam i String tipo seta
        Set<String> collectedSet = Stream.of(1, 2, 5).map(i -> "a" + i).collect(toSet());
        System.out.println(collectedSet);

        Optional.empty();
        Optional<String> aOptional = Optional.of("a");
        System.out.println("aOptional isPresent: " + aOptional.isPresent());
        System.out.println("aOptional value: " + aOptional.get());
        aOptional.ifPresent(s -> System.out.println("isPresent value=" + s));

        String str = null;
        //Optional.of(str); //NullPointerException
        Optional<String> nullOptional = Optional.ofNullable(str);
        System.out.println("nullOptional isPresent: " + nullOptional.isPresent());
        System.out.println("nullOptional value: " + nullOptional.orElse("no value"));

        // sugenereuojam streama is 10 vienetu
        Stream.generate(() -> 1).limit(10).forEach(System.out::print);
        System.out.println();
        Stream.generate(() -> 1).limit(10).forEach(i -> System.out.print(i));
        System.out.println();

        // naudojam builderi streamo kurimui
        Stream.builder().add("a").add("b").build().forEach(System.out::print);
    }
}
