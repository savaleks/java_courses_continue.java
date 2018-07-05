package lesson14;

/*
Tikslas: sukurti picos užsakymo sistemą.

Užduoties aprašymas
-------------------
Paleidus programą klientas turi pasirinkti iš meniu, ką norės užsisakyti.
Jam parodomas picų/padažų/gėrimų sąrašas su kainomis.
Po pasirinkimo apskaičiuojama galutinė užsakymo suma.
Klientas turi turėti galimybę atsisakyti arba formuoti užsakymą iš naujo.
T.y. užsakymas nėra vykdomas, kol negaunamas patvirtinimas.

Techninė dalis
--------------
PizzeriaMain - veiksmo vieta

MenuItem - interfeisas maistui

Drink - interfeisas gėrimams (galimos implementacijos: Beer, Water (still, sparkling), SoftDrink,
Tea (sugar, honey), Coffee (sugar, milk) ir t.t.)

Food - interfeisas maistui (galimos implementacijos: Pizza, Wrap, Tortilla ir t.t.)

Sauce - enumas
 */

import lesson14.drink.*;
import lesson14.food.Pizza;
import lesson14.food.Tortilla;
import lesson14.food.Wrap;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;

public class PizzeriaMain {
    public static void main(String[] args) {
        Drink beer = new Beer("alus: Utenos Premium", 0.5, 1.5);
        Drink tea = new Tea("arbata: Pasaka prie lauzo", 1.20, true);
        Drink coffee = new Coffee("kava: Arabika Gold",2.5, true);
        Drink water = new Water("mineralinis vanduo: Vytautas mineral SPA", true, 1.20);
        Drink softDring = new SoftDrink("gaivusis gerimas: Fanta New Taste", 2.5);
//        beer.selectDrink();

        Food pizza = new Pizza("piza: Margarita", 3.5, "medium");
        Food wrap = new Wrap("wrap: Double Power", 3.7);
        Food tortilla = new Tortilla("tortilla: Mexicano", 5.6);
//        pizza.selectFood();

       // List<Sauce> sauces = new ArrayList<>();
        EnumSet<Sauce> sauces = EnumSet.allOf( Sauce.class );

        List<Drink> drink = new ArrayList<>();
        drink.add(beer);
        drink.add(tea);
        drink.add(coffee);
        drink.add(water);
        drink.add(softDring);

        List<Food> food = new ArrayList<>();
        food.add(pizza);
        food.add(wrap);
        food.add(tortilla);
        int i=1;//maisto eileskumas
        int d=1;//gerimo eileskumas
        int s=1;//padazo eileskumas

        //List<Integer> order = new ArrayList<>();

        //System.out.println( "Padazai : " + sauces );

        System.out.println("Issirinkite maista(kaina eurais): ");
//        Scanner scanner = new Scanner(System.in);
//        int i1 = scanner.nextInt();

        for (Food x : food){

            System.out.println(i+ " " + x.getName()+" "+x.getPrice());
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();

        food.get(i1-1);

        System.out.println("Issirinkite padaza(kaina 0.5 euro):");
        for (Sauce o: sauces){
            System.out.println(s+ " "+o);
            s++;
        }
        Scanner scanner2 = new Scanner(System.in);
        int i3 = scanner2.nextInt();

        System.out.println("Issirinkite gerima(kaina eurais):");
        for (Drink y : drink){

            System.out.println(d+ " " + y.getName()+" "+y.getPrice());
            d++;
        }

        Scanner scanner1 = new Scanner(System.in);
        int i2 = scanner1.nextInt();

        drink.get(i2-1);

        System.out.println("Jusu uzsakymo kaina: " + food.get(i1-1).getPrice()+ " + "+"0.5"+" + " + drink.get(i2-1).getPrice()+
        " = " + (food.get(i1-1).getPrice()+drink.get(i2-1).getPrice()+ 0.5) + " eu.");

    }
}
