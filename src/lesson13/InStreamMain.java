package lesson13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InStreamMain {
    public static void main(String[] args) {
        int[] arr = {-10, 2, 0, 7, -5, 9};
        System.out.println("Suma: " + IntStream.of(arr).sum());

        System.out.println(Arrays.stream(arr).count());

    }
}