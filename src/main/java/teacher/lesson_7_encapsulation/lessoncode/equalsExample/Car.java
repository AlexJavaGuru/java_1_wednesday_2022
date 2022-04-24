package teacher.lesson_7_encapsulation.lessoncode.equalsExample;

import java.util.Objects;

public class Car {

    public String brand;
    public int horsePowers;
    public boolean engineOnOff;
    public Engine engine;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePowers == car.horsePowers &&
                engineOnOff == car.engineOnOff &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", horsePowers=" + horsePowers +
                ", engineOnOff=" + engineOnOff +
                ", engine=" + engine +
                '}';
    }
}
