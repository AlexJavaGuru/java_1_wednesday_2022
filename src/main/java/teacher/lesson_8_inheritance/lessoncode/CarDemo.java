package teacher.lesson_8_inheritance.lessoncode;

public class CarDemo {

    public static void main(String[] args) {

        ElectricCar teslaV1 = new ElectricCar("S", "Black", 2022, 100000.0, 100);
        ElectricCar teslaV2 = new ElectricCar("S", "Black", 2022, 100000.0, 100);
        PetrolCar regularCar = new PetrolCar("A8 Long", "White", 2021, 80000.0, 0);

        if (teslaV1.equals(teslaV2)) {
            System.out.println("They are equal");
        }

        Car[] cars = new Car[2];
        cars[0] = teslaV1;
        cars[1] = regularCar;

        for (Car car : cars) {
            System.out.println(car.getPrice());
        }

        //Dynamic POLYMORPHISM - Method Overriding

        //Static POLYMORPHISM - Method Overloading

        System.out.println(teslaV1);
        System.out.println(regularCar);
//
//        tesla.engineStart();
//        System.out.println(tesla);
//
////        tesla.setBatteryCapacity(0);
//        System.out.println(tesla);


    }
}
