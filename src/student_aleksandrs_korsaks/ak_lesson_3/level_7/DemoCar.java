package student_aleksandrs_korsaks.ak_lesson_3.level_7;

public class DemoCar {
    public static void main(String[] args) {
        Car firstCar = new Car("Toyota", 1999, "White", 2000, 236555);
        System.out.println(firstCar);
        firstCar.setCarColour("Black");
        firstCar.setCarPrice(500000);
        System.out.println(firstCar);
    }
}
