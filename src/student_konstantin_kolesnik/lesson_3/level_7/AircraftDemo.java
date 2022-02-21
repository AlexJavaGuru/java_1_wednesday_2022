package student_konstantin_kolesnik.lesson_3.level_7;

class AircraftDemo {

    public static void main(String[] args) {

        Aircraft airbus = new Aircraft("Airbus", "A320-200", 27000, 1988, "France", 37.6, "101000000$" );
        airbus.aircraftPrint();

        Aircraft boeing = new Aircraft("Boeing", "777-200ER", 93700, 1996, "USA", 63.7, "306600000$" );
        boeing.aircraftPrint();


    }
}

