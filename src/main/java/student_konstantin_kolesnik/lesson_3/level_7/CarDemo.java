package student_konstantin_kolesnik.lesson_3.level_7;

class CarDemo {

    public static void main(String[] args) {
        Car audi = new Car("Audi A6", 1998, "600 EUR");
        audi.carPrint();

        Car jeep = new Car("Jeep Grand Cherokee WJ", 2003, "3300 USD");
        jeep.carPrint();
    }
}
