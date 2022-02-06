package student_aleksandrs_jakovenko.lesson_3.level_7;
// Task_33
class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    String getManufacturer(){
        this.manufacturer = manufacturer;
        return manufacturer;
    }
    String getModel(){
        this.model = model;
        return model;
    }
}
