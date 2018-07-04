package lesson16.testoUzduotys;
//interfeisas su defoltiniu metodu, kuris spaudina 'DEFAULT'.
public interface DefaultInterface {
    default void myMethod() {
        System.out.println("default");
    }
}
