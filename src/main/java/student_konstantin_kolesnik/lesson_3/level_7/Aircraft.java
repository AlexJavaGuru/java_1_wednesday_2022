package student_konstantin_kolesnik.lesson_3.level_7;

class Aircraft {

    String brand;
    String model;
    int power;
    int year;
    String country;
    double length;
    String price;

    public Aircraft(String brand, String model, int power, int year, String country, double length, String price) {

        this.brand = brand;
        this.model = model;
        this.power = power;
        this.year = year;
        this.country = country;
        this.length = length;
        this.price = price;
    }

    void aircraftPrint() {
        System.out.println("Specs:");
        System.out.println("Aircraft: " + brand + " " + model);
        System.out.println("Power: " + power + " pound force, " + "Length: " + length + "m, " + " Country: " + country + ", " + " Year: " + year);
        System.out.println("Price: " + price);
        System.out.println();
    }


}
