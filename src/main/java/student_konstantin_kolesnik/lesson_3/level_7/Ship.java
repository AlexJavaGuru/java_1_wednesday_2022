package student_konstantin_kolesnik.lesson_3.level_7;

class Ship {

    String name;
    double teus;
    int year;
    double meterLong;
    String built;


    public Ship(String name, double teus, int year, double meterLong, String built) {
        this.name = name;
        this.teus = teus;
        this.year = year;
        this.meterLong = meterLong;
        this.built = built;
    }
    void shipPrint() {
        System.out.println("Ship name: " + name);
        System.out.println("TEUs capacity: " + teus);
        System.out.println("Year of built: " + year);
        System.out.println("Meters long: " + meterLong);
        System.out.println("Company name / Country of origin: " + built);
        System.out.println();
    }
    void veselPrint() {
        System.out.println("Top 3 World’s Largest Container Ships In 2021");
        System.out.println();
    }
}

