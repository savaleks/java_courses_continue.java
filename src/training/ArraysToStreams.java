package training;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStreams {

    public static void main(String[] args) {

        //Object Array
        String[] array = {"t", "e", "c", "h", "i", "o"};

        //Arrays.stream
        Stream<String> stream1 = Arrays.stream(array);
        stream1.forEach(x -> System.out.println(x));

        //Stream.of
        Stream<String> stream2 = Stream.of(array);
        stream2.forEach(x -> System.out.println(x));

        //Premitive Array
        int[] intArray = {1, 2, 3, 4, 5};

        //Arrays.stream
        IntStream intStream1 = Arrays.stream(intArray);
        intStream1.forEach(x -> System.out.println(x));

        //Stream.of
        Stream<int[]> tempStream = Stream.of(intArray);
        IntStream intStream2 = tempStream.flatMapToInt(x -> Arrays.stream(x));
        intStream2.forEach(x -> System.out.println(x));
    }
}