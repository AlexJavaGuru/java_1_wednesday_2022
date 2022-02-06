package student_konstantin_kolesnik.lesson_3.level_7;

class CarDemo {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.carPrint();

        Car car2 = new Car(5.0);
        car2.carPrint();

        Car car3 = new Car(1.9, 2004, 6.9, "54000€");
        car3.carPrint();

        Car car4 = new Car(2.7, 5.7,"GM", "Van", "Hybrid", "25000€");
        car4.carPrint();
    }
}
