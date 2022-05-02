package student_daniel_demisins.hw_lesson3.lvl7;

public class Car {
    String brand;
    String model;
    int age;
    String color;

    Car(String brand, String model, int age, String color) {
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.color = color;
    }
    String getBrand() {
        return this.brand;
    }
    String getModel() {
        return this.model;
    }
    int getAge() {
        return this.age;
    }
    String getColor() {
        return this.color;
    }
}
