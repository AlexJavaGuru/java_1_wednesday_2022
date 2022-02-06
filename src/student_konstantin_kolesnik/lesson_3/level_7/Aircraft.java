package student_konstantin_kolesnik.lesson_3.level_7;

class Aircraft {

    String name = "Boieng";
    String model = "777";
    int mp = 25000;
    int year = 2007;
    double lenght = 47.7;
    String price = "25000000€";

    Aircraft() {
        System.out.println("Sell:");
        System.out.println();
    }
    Aircraft(String name, String model, int mp, int year, double lenght, String price) {
        this.name = name;
        this.model = model;
        this.mp = mp;
        this.year = year;
        this.lenght = lenght;
        this.price = price;
    }
    void aircraftPrint() {
        System.out.println(name);
        System.out.println(model);
        System.out.println(mp);
        System.out.println(year);
        System.out.println(lenght);
        System.out.println(price);
        System.out.println();
    }
}
