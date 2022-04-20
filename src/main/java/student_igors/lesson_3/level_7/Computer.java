package student_igors.lesson_3.level_7;

public class Computer {

        String manufacturer;
        String model;

        public Computer() {
        }

        public Computer(String manufacturer, String model) {
            this.manufacturer = manufacturer;
            this.model = model;
        }
    String getManufacturer() {
        return this.manufacturer;
    }
    String getModel() {
        return this.model;
        }
}

