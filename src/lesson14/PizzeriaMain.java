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
import java.util.List;
import java.util.Scanner;

public class PizzeriaMain {
    public static void main(String[] args) {
        Drink beer = new Beer("Utenos", 0.5, 1.5);
        Drink tea = new Tea("Pasaka prie lauzo", 1.20, true);
        Drink coffee = new Coffee("Arabika",2.5, true);
        Drink water = new Water("Vytautas mineral SPA", true, 1.20);
        Drink softDring = new SoftDrink("Fanta", 2.5);
//        beer.selectDrink();

        Food pizza = new Pizza("Margarita", 3.5, "medium");
        Food wrap = new Wrap("wrap1", 3.7);
        Food tortilla = new Tortilla("Tortilla1", 5.6);

//        pizza.selectFood();

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
        int i=1;
        int d=1;

        //List<Integer> order = new ArrayList<>();

        System.out.println("Pasirinkite patekala: ");
//        Scanner scanner = new Scanner(System.in);
//        int i1 = scanner.nextInt();

        for (Food x : food){

            System.out.println(i+ " " + x.getName()+" "+x.getPrice());
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();

        food.get(i1-1);


        for (Drink y : drink){

            System.out.println(d+ " " + y.getName()+" "+y.getPrice());
            d++;
        }

        Scanner scanner1 = new Scanner(System.in);
        int i2 = scanner1.nextInt();
    }

}
