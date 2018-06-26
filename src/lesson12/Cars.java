package lesson12;

import java.util.Comparator;
import java.lang.Comparable;

public class Cars implements Comparable<Cars>{

    private String carNumber;
    private String carModel;
    private String carOwnerName;
    private String carOwnerSurname;

    public Cars(String carNumber, String carModel, String carOwnerName, String carOwnerSurname) {
        //super();
        this.carNumber = carNumber;
        this.carModel = carModel;
        this.carOwnerName = carOwnerName;
        this.carOwnerSurname = carOwnerSurname;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarOwnerName() {
        return carOwnerName;
    }

    public String getCarOwnerSurname() {
        return carOwnerSurname;
    }

    public static Comparator<Cars> getCarNameComparator() {
        return CarsNameComparator;
    }

    public int compareTo(Cars compareCars) {

        int compareNames = carOwnerName.compareTo(carOwnerName);

        return compareNames;
    }

    public static Comparator<Cars> CarsNameComparator;

    static {
        CarsNameComparator = new Comparator<Cars>() {

            public int compare(Cars car1, Cars car2) {

                String carName1 = car1.getCarOwnerName().toUpperCase();
                String carName2 = car2.getCarOwnerName().toUpperCase();

                return carName1.compareTo(carName2);

            }

        };
    }
}
