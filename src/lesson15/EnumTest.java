package lesson15;

public class EnumTest {
    public static void main(String[] args) {
        double result = EnumOperation.PLUS.calculate(1, 2);
        System.out.println(result);
        double result1 = EnumOperation.MINUS.calculate(6.5,4.1);
        System.out.println(String.format("%.1f", result1));
    }
}
