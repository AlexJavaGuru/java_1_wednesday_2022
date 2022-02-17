package student_aleksejs_iljins.lesson_03.level_7;
//Task33
public class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    String getManufacturer(){
        return this.manufacturer;
    }
    String getModel(){
        return this.model;
    }
}
