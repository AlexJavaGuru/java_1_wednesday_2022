package student_aleksandrs_jakovenko.lesson_3.level_5;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Black");
        dog.voice();
//        Task20
//        dog.happyBirthday();
//        dog.voice();
        dog.changeColor("White");
        dog.getColor();
        String color = dog.getColor();
        dog.voice();
        System.out.println("New color is: " + color);
    }
}
