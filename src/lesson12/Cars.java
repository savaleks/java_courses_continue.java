package lesson12;

 class Cars {

    private String carNumber;
    private String carModel;
    private String carOwnerName;
    private String carOwnerSurname;

     Cars(String carNumber, String carModel, String carOwnerName, String carOwnerSurname) {
        super();
        this.carNumber = carNumber;
        this.carModel = carModel;
        this.carOwnerName = carOwnerName;
        this.carOwnerSurname = carOwnerSurname;
    }

     String getCarNumber() {
        return carNumber;
    }

     String getCarModel() {
        return carModel;
    }

     String getCarOwnerName() {
        return carOwnerName;
    }

     String getCarOwnerSurname() {
        return carOwnerSurname;
    }

}
