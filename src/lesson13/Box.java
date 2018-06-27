package lesson13;

public class Box<T1,T2> {
    private T1 sauce;
    private T2 pizza;

    public Box(T1 sauce, T2 pizza) {
        this.sauce = sauce;
        this.pizza = pizza;
    }
    void showContent(){
        System.out.println(format );
    }
}
