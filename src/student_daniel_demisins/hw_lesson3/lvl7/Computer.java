package student_daniel_demisins.hw_lesson3.lvl7;

public class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer(){
        return manufacturer;
    }

    String getModel(){
        return model;
    }
}
