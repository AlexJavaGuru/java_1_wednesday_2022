package student_konstantin_kolesnik.lesson_3.level_7;

class Car {

    double motor = 5.0;
    String type = "Coupe";
    String brand = "Ford Mustang";
    int year = 2007;
    String fuelType = "Petrol";
    double fuelEcon = 11;
    String price = "24000€";

    Car() {
        System.out.println("Buy It Now!");
        System.out.println();
    }

    Car(double newMotor) {
        motor = newMotor;
        brand = "Dodge Charger";
        year = 2016;
        price = "170000€";
    }
    Car(double motor, int newYear, double fuelEcon, String price) {
        this.motor = motor;
        brand = "Volkswagen Passat";
        year = newYear;
        fuelType = "Diesel";
        type = "Universal";
        this.fuelEcon = fuelEcon;
        this.price = price;
    }
    Car(double motor, double fuelEcon, String brand, String type, String fuelType, String price) {
        this.brand = brand;
        this.motor = motor;
        this.fuelEcon = fuelEcon;
        this.type = type;
        this.fuelType = fuelType;
        this.price = price;
    }
    void carPrint() {
        System.out.println(brand);
        System.out.println(motor);
        System.out.println(type);
        System.out.println(fuelType);
        System.out.println(year);
        System.out.println(price);
        System.out.println();
    }
}
