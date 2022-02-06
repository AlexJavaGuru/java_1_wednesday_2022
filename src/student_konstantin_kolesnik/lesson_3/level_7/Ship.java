package student_konstantin_kolesnik.lesson_3.level_7;

class Ship {

    String name = "Ever Ace";
    double teus = 23.992;
    int year = 2021;
    double meterLong = 400;
    String built = "Samsung Heavy Industries in / South Korea";

    Ship() {
    }
    Ship(String name, double newTeus, int year, double meterLong, String newBuilt) {
        this.name = name;
        teus = newTeus;
        this.year = year;
        this.meterLong = meterLong;
        built = newBuilt;
    }
    Ship(String nameTwo, int yearTwo, double teusTwo, double meterLongTwo, String builtTwo) {
        this.name = nameTwo;
        this.teus = teusTwo;
        this.year = yearTwo;
        this.meterLong = meterLongTwo;
        this.built = builtTwo;
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

