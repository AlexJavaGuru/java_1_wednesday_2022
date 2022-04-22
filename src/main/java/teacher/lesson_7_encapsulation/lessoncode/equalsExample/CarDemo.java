package teacher.lesson_7_encapsulation.lessoncode.equalsExample;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", new Engine("Petrol", 310));
        Car car2 = car1;
        Car car3 = new Car("BMW", new Engine("Petrol", 310));

        if (car1.equals(car1)) { //true
            System.out.println("Car1 = Car1");
        }
        if (car1.equals(car2)) { //true
            System.out.println("Car1 = Car2");
        }
        if (car1.equals(car3)) { //false
            System.out.println("Car1 = Car3");
        }
        String car1String = car1.toString();
        System.out.println(car1String);
        System.out.println(car2);
        System.out.println(car3);
    }
}
