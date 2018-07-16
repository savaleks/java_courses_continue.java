package lesson24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        Pattern x = Pattern.compile("[a-b]");
        Matcher y = x.matcher(" scrambled it to make a" +
                " type specimen book. It has survived not only " +
                "five centuries, but also the leap into electronic typesetting," +
                " remaining essentially unchanged");
        while (y.find()){
            System.out.println( y.start() + " " + y.group() + " ");
        }
        System.out.println("");
    }
}
/*
output
4 a
6 b
18 a
22 a
38 b
48 a
85 b
89 a
100 a
135 a
149 a
158 a
 */
