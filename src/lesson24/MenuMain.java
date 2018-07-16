package lesson24;
/*
Parašyti programą, kuri sukuria tekstinius failus food.txt bei drinks.txt su tam tikra informacija ir nukopijuoja jų turinį į menu.txt failą.
Tarp gėrimų ir maisto įterpkite kokį nors skirtuką.
Po kopijavimo išvesti menu.txt turinį į konsolę.
Jei faile saugome tik pavadinimus, rezultatas turėtų būti maždaug toks:
menu.txt:
---------
Margarita
-=-=-=-=-
Beer
Cola
 */

import lesson18.Arrays;

import java.io.*;

public class MenuMain {

    public static void main(String[] args) throws IOException {
        //sukuriam drink faila ir uzraseme gerimu pavadinimus;
        String data = "Beer, Coffee, Tea, Milk";
        FileOutputStream out = new FileOutputStream("C:/Users/PC/Desktop/drinks.txt");
        out.write(data.getBytes());
        out.close();
        //sukuriam faila food ir uzraseme maisto pavadinimus;
        String data1 = "Pizza, Wrap, Kebab, Kibin";
        FileOutputStream out1 = new FileOutputStream("C:/Users/PC/Desktop/food.txt");
        out1.write(data1.getBytes());
        out1.close();
        //padarem nauja menu faila su drink ir food turiniu;
        PrintWriter menu = new PrintWriter("C:/Users/PC/Desktop/menu.txt");

        BufferedReader drinks = new BufferedReader(new FileReader("C:/Users/PC/Desktop/drinks.txt"));
        BufferedReader food = new BufferedReader(new FileReader("C:/Users/PC/Desktop/food.txt"));

        String line1 = drinks.readLine();
        String line2 = food.readLine();
        String a = "";
        String b = "";

        while (line1 != null || line2 !=null)
        {
            if(line1 != null)
            {
                a += line1;
                menu.println(line1);
                line1 = drinks.readLine();
            }

            if(line2 != null)
            {
                b += line2;
                menu.println(line2);
                line2 = food.readLine();
            }
        }

        menu.flush();

        drinks.close();
        food.close();
        menu.close();

        String text1 = a.replaceAll("\\s","");
        String result1 = text1.replaceAll(",", "\n");

        String text2 = b.replaceAll("\\s","");
        String result2 = text2.replaceAll(",", "\n");

        System.out.println("menu.txt:");

        System.out.println("---DRINKS---");
        int count = 1;
        String[] lines = result1.split("\\r?\\n");
        for (String line : lines) {
            System.out.println( count++ + ". " + line);
        }

        System.out.println("---FOOD---");
        int count1 = 1;
        String[] lines1 = result2.split("\\r?\\n");
        for (String line : lines1) {
            System.out.println(count1++ + ". " + line);
        }
    }
}
/*
output
menu.txt:
---DRINKS---
1. Beer
2. Coffee
3. Tea
4. Milk
---FOOD---
1. Pizza
2. Wrap
3. Kebab
4. Kibin
 */

