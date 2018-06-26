package lesson12;

import java.util.Comparator;
import java.lang.Comparable;

public class Cars implements Comparable<Cars>{

    private String carNumber;
    private String carModel;
    private String carOwnerName;
    private String carOwnerSurname;

    public Cars(String carNumber, String carModel, String carOwnerName, String carOwnerSurname) {
        super();
        this.carNumber = carNumber;
        this.carModel = carModel;
        this.carOwnerName = carOwnerName;
        this.carOwnerSurname = carOwnerSurname;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarOwnerName() {
        return carOwnerName;
    }

    public void setCarOwnerName(String carOwnerName) {
        this.carOwnerName = carOwnerName;
    }

    public String getCarOwnerSurname() {
        return carOwnerSurname;
    }

    public void setCarOwnerSurname(String carOwnerSurname) {
        this.carOwnerSurname = carOwnerSurname;
    }

    public static Comparator<Cars> getCarNameComparator() {
        return CarsNameComparator;
    }

    public static void setCarNameComparator(Comparator<Cars> carNameComparator) {
        CarsNameComparator = carNameComparator;
    }

    public int compareTo(Cars compareCars) {

        int compareNames = carOwnerName.compareTo(carOwnerSurname);

        return compareNames;


    }

    public static Comparator<Cars> CarsNameComparator
            = new Comparator<Cars>() {

        public int compare(Cars car1, Cars car2) {

            String carName1 = car1.getCarOwnerName().toUpperCase();
            String carName2 = car2.getCarOwnerName().toUpperCase();

            return carName1.compareTo(carName2);

        }

    };
}
