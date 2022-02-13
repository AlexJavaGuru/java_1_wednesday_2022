package student_darja_soroka.lesson_03.level_5;

public class DogDemo {

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "red");
        myDog.voice();

        myDog.happyBirthday();
        myDog.voice();

        myDog.happyBirthday();
        myDog.changeColor("black");
        myDog.voice();
    }
}
