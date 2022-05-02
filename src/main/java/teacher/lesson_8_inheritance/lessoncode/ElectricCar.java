package teacher.lesson_8_inheritance.lessoncode;

import java.util.Objects;

public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String brand, String color, int manufactureYear, double price, int batteryCapacity) {
        super(brand, color, manufactureYear, price);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void engineStart() {
        if (batteryCapacity > 0) {
            engineOnOff = true;
        }
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        if (batteryCapacity <= 0 && engineOnOff) {
            engineOnOff = false;
        }
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", price=" + price +
                ", engineOnOff=" + engineOnOff +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectricCar that = (ElectricCar) o;
        return batteryCapacity == that.batteryCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity);
    }
}
