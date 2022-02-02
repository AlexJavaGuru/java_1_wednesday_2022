package student_arturs_melnikovs.lesson_03.level_05;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Шарик", 5, "Чёрный");
        myDog.voice();

        myDog.happyBirthday();
        myDog.voice();

        myDog.changeColor("Белый");
        myDog.voice();
    }
}
