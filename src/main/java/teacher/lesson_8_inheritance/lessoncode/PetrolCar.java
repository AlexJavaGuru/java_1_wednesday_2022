package teacher.lesson_8_inheritance.lessoncode;

import java.util.Objects;

public class PetrolCar extends Car {

    private int petrolTank;

    public PetrolCar(String brand, String color, int manufactureYear, double price, int petrolTank) {
        super(brand, color, manufactureYear, price);
        this.petrolTank = petrolTank;
    }

    @Override
    void engineStart() {
        if (petrolTank > 0 ) {
            engineOnOff = true;
        }
    }

    public int getPetrolTank() {
        return petrolTank;
    }

    public void setPetrolTank(int petrolTank) {
        this.petrolTank = petrolTank;
    }

    @Override
    public String toString() {
        return "PetrolCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", price=" + price +
                ", engineOnOff=" + engineOnOff +
                ", petrolTank=" + petrolTank +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetrolCar petrolCar = (PetrolCar) o;
        return petrolTank == petrolCar.petrolTank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(petrolTank);
    }
}
