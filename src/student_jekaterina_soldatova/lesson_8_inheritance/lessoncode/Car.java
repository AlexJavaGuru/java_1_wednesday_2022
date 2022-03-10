package student_jekaterina_soldatova.lesson_8_inheritance.lessoncode;

import java.util.Objects;

public abstract class Car {

    protected String brand;
    protected String color;
    protected int manufactureYear;
    protected double price;
    protected int currentSpeed;
    protected boolean engineOnOff;

    public Car(String brand, String color, int manufactureYear, double price) {
        this.brand = brand;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.price = price;
    }

    abstract void engineStart();

    public void accelerate() {
        this.currentSpeed++;
    }

    public void decelerate() {
        this.currentSpeed--;
    }

    public String getBrand() {
        return brand;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isEngineOnOff() {
        return engineOnOff;
    }

    public void setEngineOnOff(boolean engineOnOff) {
        this.engineOnOff = engineOnOff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufactureYear == car.manufactureYear && Double.compare(car.price, price) == 0 && currentSpeed == car.currentSpeed && engineOnOff == car.engineOnOff && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, manufactureYear, price, currentSpeed, engineOnOff);
    }
}
