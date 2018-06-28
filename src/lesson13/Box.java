package lesson13;

import static java.lang.String.format;

public class Box<T1,T2> {
    private final T1 sauce;
    private final T2 pizza;

    Box(T1 sauce, T2 pizza) {
        this.sauce = sauce;
        this.pizza = pizza;
    }
    void showContent(){
        System.out.println(format("%s + %s", sauce, pizza) );
    }
}
