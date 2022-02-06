package student_konstantin_kolesnik.lesson_3.level_7;

class AircraftDemo {

    public static void main(String[] args) {

        Aircraft boieng = new Aircraft();
        boieng.aircraftPrint();

        Aircraft tupolev = new Aircraft("Tupolev", "Superjet", 5000, 2016, 53.3, "50000000€");
        tupolev.aircraftPrint();
    }
}

