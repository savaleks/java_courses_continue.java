package collections.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatPerPow) {
        this.theatreName = theatreName;
        //skaiciuoja eiles nuo A...Z; -1 todel kad skaiciuoja nuo 0, be -1 jeigu irasytum 3 isvestu 4, index(0,1,2,3)
        int lastRows = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRows; row++){ //butent taip reikia rasyti 'A' o ne taip "A";
            for(int seatNum = 1; seatNum <= seatPerPow; seatNum++){
                Seat seat = new Seat(row + String.format("%2d", seatNum ));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = null;
        for (Seat seat: seats){
            if (seat.getSeatNumber().equals(seatNumber)){
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("No seats " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }

    public void getSeats(){
        for (Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat {
        private String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }

}
