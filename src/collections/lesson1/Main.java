package collections.lesson1;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Lietuva", 5, 12);
      //  theatre.getSeats(); //showing all list of sets in rows;
        if (theatre.reserveSeat("B11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}

/*
output
Seat B11 reserved
Please pay

not correct working if I set number from 1..9, ex.: A5, B3 etc.
 */
