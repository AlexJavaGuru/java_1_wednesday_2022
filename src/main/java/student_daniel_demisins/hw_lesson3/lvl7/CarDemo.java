package student_daniel_demisins.hw_lesson3.lvl7;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar= new Car("Volkswagen","Passat", 2006, "Серебряного " );
        String brand= myCar.getBrand();
        String model=myCar.getModel();
        int age= myCar.getAge();
        String color= myCar.getColor();
        System.out.println("У меня машина " +brand+ " модель " +model );
        System.out.println("Она " +age+ " года и " +color+ " цвета");
    }
}
