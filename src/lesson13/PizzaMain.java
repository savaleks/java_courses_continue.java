package lesson13;

/*
1. Sukurti nauja metoda rikiavimui pagal automobilio marke, valst. numeri ir savininko varda.
2. Sukurti enum'a Sauce (MILD, SPICY, MIX) su lauku description, kuriame butu detalesne informacija apie padaza
(metodas toString() turi isvesti si aprasyma).
Sukurti klase Pizza, su lauku name (metodas toString() turi isvesti si pavadinima).
Sukurti generic klase Box<T1, T2>, kuri butu wrapperis musu picai ir padazui. Ji atitks dezutes savoka musu produktams.
Box klaseje aprasyti metoda, kuris atspausdintu jos turini (pvz. jei ideta pica Margarita, o padazas svelnus,
 rezultatas turetu buti: Margarita+svelnus).
Naujoje klaseje (pvz. PizzaMain) sukurti dezute, ideti i ja pica su padazu ir patikrinti dezutes turini.
 */

public class PizzaMain {
    public static void main(String[] args) {
        System.out.println("Sauces list:");
        for(EnumDemo.Sauce sauce_list : EnumDemo.Sauce.values()){

        System.out.println(sauce_list.toString() +" > " + sauce_list.getDescription() + ".");
    }
}}
