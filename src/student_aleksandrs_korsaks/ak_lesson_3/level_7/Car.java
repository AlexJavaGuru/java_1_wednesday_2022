package student_aleksandrs_korsaks.ak_lesson_3.level_7;

class Car {
    private final String carModel;
    private final int yearOfProduction;
    private int carPrice;
    private final int carOdometr;
    private String carColour;

    public Car(String carModel, int yearOfProduction, String carColour, int carPrice, int carOdometr) {
        this.carModel = carModel;
        this.yearOfProduction = yearOfProduction;
        this.carColour = carColour;
        this.carPrice = carPrice;
        this.carOdometr = carOdometr;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    @Override
    public String toString() {
        return "Car {" +
                "Model - '" + carModel + '\'' +
                "; Year of production - " + yearOfProduction +
                "; Colour - " + carColour +
                "; Price - " + carPrice +
                "; Odometr - " + carOdometr +
                '}';
    }
}
